package com.dtrband.dtrbackend01.controllers;

import com.dtrband.dtrbackend01.models.Contact;
import com.dtrband.dtrbackend01.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {
    @Autowired
    private ContactService contactService;
    //create
    @PostMapping
    public void addContact(@RequestBody Contact contact){
        contactService.addContact(contact);
    }

    @GetMapping
    public List<Contact> getAll(){
        return contactService.getAllContacts();
    }

    @PutMapping
    public void updateById(@RequestBody Contact contact){
        contactService.updateById(contact);
    }

    @DeleteMapping
    public void deleteById(@RequestParam Integer id){
        contactService.deleteById(id);
    }
}
