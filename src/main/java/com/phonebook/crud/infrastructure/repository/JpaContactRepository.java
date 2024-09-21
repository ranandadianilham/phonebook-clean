package com.phonebook.crud.infrastructure.repository;

import com.phonebook.crud.domain.Contact;
import com.phonebook.crud.domain.ContactRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaContactRepository extends JpaRepository<Contact, Long>, ContactRepository {

}