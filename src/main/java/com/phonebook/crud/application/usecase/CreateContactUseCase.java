package com.phonebook.crud.application.usecase;

import com.phonebook.crud.domain.Contact;
import com.phonebook.crud.infrastructure.dto.CreateContactDto;

public interface CreateContactUseCase {
    Contact execute(Contact contact);
}
