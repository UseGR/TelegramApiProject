package ru.galeev.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MailParams {
    private String id;
    private String emailTo;
}
