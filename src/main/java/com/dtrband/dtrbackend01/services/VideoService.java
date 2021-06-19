package com.dtrband.dtrbackend01.services;

import com.dtrband.dtrbackend01.models.Item;
import com.dtrband.dtrbackend01.models.Video;
import com.dtrband.dtrbackend01.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {

    @Autowired
    VideoRepository videoRepository;

    public void addVideo(Video video) {
        videoRepository.save(video);
    }

    public List<Video> getAll() {
        return videoRepository.findAll();
    }

    public void updateById(Video video) {
        Video oldVideo = videoRepository.findById(video.getId()).get();
        if(video.getDescription() != null)oldVideo.setDescription(video.getDescription());
        if(video.getTitle() != null)oldVideo.setTitle(video.getTitle());
        if(video.getUrl() != null)oldVideo.setUrl(video.getUrl());
        videoRepository.save(oldVideo);
    }

    public void deleteById(Integer id) {
        videoRepository.deleteById(id);
    }
}
