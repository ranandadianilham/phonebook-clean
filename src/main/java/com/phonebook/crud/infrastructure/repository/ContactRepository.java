package com.phonebook.crud.infrastructure.repository;

import com.phonebook.crud.domain.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long>, com.phonebook.crud.domain.ContactRepository {
}