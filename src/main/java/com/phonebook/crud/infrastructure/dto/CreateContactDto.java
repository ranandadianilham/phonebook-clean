package com.phonebook.crud.infrastructure.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateContactDto {
    @NotBlank(message = "Name is required")
    private String name;
    @NotBlank(message = "Phone number is required")
    private String phoneNumber;
    @NotBlank(message = "Email is required")
    private String email;
}
