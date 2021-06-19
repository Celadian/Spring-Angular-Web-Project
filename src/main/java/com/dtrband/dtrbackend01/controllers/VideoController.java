package com.dtrband.dtrbackend01.controllers;

import com.dtrband.dtrbackend01.models.Video;
import com.dtrband.dtrbackend01.services.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/videos")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @PostMapping
    public void addVideo(@RequestBody Video video){
        videoService.addVideo(video);
    }

    @GetMapping
    public List<Video> getAll(){
        return videoService.getAll();
    }

    @PutMapping
    public void updateById(@RequestBody Video video){
        videoService.updateById(video);
    }

    @DeleteMapping
    public void deleteById(@RequestParam Integer id){
        videoService.deleteById(id);
    }
}
