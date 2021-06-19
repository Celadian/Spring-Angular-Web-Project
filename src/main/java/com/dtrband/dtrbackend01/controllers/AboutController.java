package com.dtrband.dtrbackend01.controllers;

import com.dtrband.dtrbackend01.models.About;
import com.dtrband.dtrbackend01.services.AboutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/about")
public class AboutController {
    @Autowired
    private AboutService aboutService;

    @PostMapping
    public void addAbout(@RequestBody About about){
        aboutService.addAbout(about);
    }

    @GetMapping
    public List<About> getAllAbout(){
        return aboutService.getAllAbout();
    }

    @PutMapping
    public void updateById(@RequestBody About about){
        aboutService.updateById(about);
    }

    @DeleteMapping
    public void deleteById(@RequestParam Integer id){
        aboutService.deleteById(id);
    }
}
