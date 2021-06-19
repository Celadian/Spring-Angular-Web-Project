package com.dtrband.dtrbackend01.controllers;

import com.dtrband.dtrbackend01.models.Music;
import com.dtrband.dtrbackend01.services.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/music")
public class MusicController {
    @Autowired
    private MusicService musicService;

    @PostMapping
    public void addMusic(@RequestBody Music music){
        musicService.addMusic(music);
    }

    @GetMapping
    public List<Music> getAll(){
        return musicService.getAllAbout();
    }

    @PutMapping
    public void updateById(@RequestBody Music music){ musicService.updateById(music); }

    @DeleteMapping
    public void deleteById(@RequestParam Integer id){
        musicService.deleteById(id);
    }
}
