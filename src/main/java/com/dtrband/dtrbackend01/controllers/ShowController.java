package com.dtrband.dtrbackend01.controllers;

import com.dtrband.dtrbackend01.models.Show;
import com.dtrband.dtrbackend01.services.ShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shows")
public class ShowController {
    @Autowired
    private ShowService showService;

    @PostMapping
    public void addShow(@RequestBody Show show){
        showService.addShow(show);
    }

    @GetMapping
    public List<Show> getAllAbout(){
        return showService.getAllAbout();
    }

    @PutMapping
    public void updateById(@RequestBody Show show){
        showService.updateById(show);
    }

    @DeleteMapping
    public void deleteById(@RequestParam Integer id){
        showService.deleteById(id);
    }


}
