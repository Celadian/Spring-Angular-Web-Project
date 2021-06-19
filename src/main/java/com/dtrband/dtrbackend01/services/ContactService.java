package com.dtrband.dtrbackend01.services;

import com.dtrband.dtrbackend01.models.About;
import com.dtrband.dtrbackend01.models.Contact;
import com.dtrband.dtrbackend01.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    public void addContact(Contact contact) {
        contactRepository.save(contact);
    }

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public void updateById(Contact contact) {
        Contact oldContact = contactRepository.findById(contact.getId()).get();
        if(contact.getEmail() != null)oldContact.setEmail(contact.getEmail());
        if(contact.getPhone() != null)oldContact.setPhone(contact.getPhone());
        if(contact.getTitle() != null)oldContact.setTitle(contact.getTitle());
        contactRepository.save(oldContact);
    }

    public void deleteById(Integer id) {
        contactRepository.deleteById(id);
    }
}
