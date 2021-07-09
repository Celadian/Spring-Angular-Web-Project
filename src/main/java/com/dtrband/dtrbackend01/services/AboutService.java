package com.dtrband.dtrbackend01.services;

import com.dtrband.dtrbackend01.models.About;
import com.dtrband.dtrbackend01.repositories.AboutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AboutService {

    @Autowired
    AboutRepository aboutRepository;

    public void addAbout(About about) {
        aboutRepository.save(about);
    }

    public List<About> getAllAbout() { return aboutRepository.findAll(); }

    public void updateById(About about) {
        About oldAbout = aboutRepository.findById(about.getId()).get();
        if(about.getTitle() != null)oldAbout.setTitle(about.getTitle());
        if(about.getDescription() != null)oldAbout.setDescription(about.getDescription());
        if(about.getImgUrl() != null)oldAbout.setImgUrl(about.getImgUrl());
        aboutRepository.save(oldAbout);
    }
    public void deleteById(Integer id) { aboutRepository.deleteById(id); }
}
