package com.dtrband.dtrbackend01.repositories;

import com.dtrband.dtrbackend01.models.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
