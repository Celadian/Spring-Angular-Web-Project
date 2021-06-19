package com.dtrband.dtrbackend01.services;

import com.dtrband.dtrbackend01.models.Item;
import com.dtrband.dtrbackend01.models.Show;
import com.dtrband.dtrbackend01.repositories.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowService {

    @Autowired
    ShowRepository showRepository;

    public void addShow(Show show) {
        showRepository.save(show);
    }

    public List<Show> getAllAbout() {
        return showRepository.findAll();
    }

    public void updateById(Show show) {
        Show oldShow = showRepository.findById(show.getId()).get();
        if(show.getDescription() != null)oldShow.setDescription(show.getDescription());
        if(show.getTitle() != null)oldShow.setTitle(show.getTitle());
        if(show.getImgUrl() != null)oldShow.setImgUrl(show.getImgUrl());
        if(show.getDateOf() != null)oldShow.setDateOf(show.getDateOf());
        if(show.getDatePosted() != null)oldShow.setDatePosted(show.getDatePosted());
        if(show.getLocation() != null)oldShow.setLocation(show.getLocation());
        if(show.getEventLink() != null)oldShow.setEventLink(show.getEventLink());
        showRepository.save(oldShow);
    }

    public void deleteById(Integer id) {
        showRepository.deleteById(id);
    }
}
