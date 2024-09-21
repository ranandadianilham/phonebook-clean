package com.phonebook.crud.usecase;

import java.util.List;
import java.util.Optional;

import com.phonebook.crud.domain.Contact;

public interface ContactUsecase {
    public List<Contact> getAllContacts();
    public Optional<Contact> getContactById(Long id);
    public Contact createContact(Contact contact);
    public Contact updateContact(Long id, Contact contactDetails);
    public void deleteContact(Long id);
}
