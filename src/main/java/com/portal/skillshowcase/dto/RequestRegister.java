package com.portal.skillshowcase.dto;

import jakarta.validation.constraints.*;
import lombok.*;

@Getter @Setter
public class RequestRegister {
    @NotBlank
    private String name;

    @Email @NotBlank
    private String email;

    @NotBlank @Size(min = 6)
    private String password;
}