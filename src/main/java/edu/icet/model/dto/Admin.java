package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Admin {

    private String adminId;
    private String name;
    private String email;


}
