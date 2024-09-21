package com.phonebook.crud.domain;

import java.util.List;
import java.util.Optional;

public interface ContactRepository {
    List<Contact> findAll();
    
    Optional<Contact> findById(Long id);
    
    Contact save(Contact contact);
    
    void deleteById(Long id);
}
