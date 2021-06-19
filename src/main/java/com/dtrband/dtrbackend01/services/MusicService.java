package com.dtrband.dtrbackend01.services;

import com.dtrband.dtrbackend01.models.Item;
import com.dtrband.dtrbackend01.models.Music;
import com.dtrband.dtrbackend01.repositories.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicService {

    @Autowired
    MusicRepository musicRepository;

    public void addMusic(Music music) {
        musicRepository.save(music);
    }

    public List<Music> getAllAbout() {
        return musicRepository.findAll();
    }

    public void updateById(Music music) {
        Music oldMusic = musicRepository.findById(music.getId()).get();
        if(music.getTitle() != null)oldMusic.setTitle(music.getTitle());
        musicRepository.save(oldMusic);
    }

    public void deleteById(Integer id) {
        musicRepository.deleteById(id);
    }
}
