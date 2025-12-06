package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Member {

    private String id;
    private String name;
    private String email;
    private String address;
    private LocalDate dob;
    private double BMI;
    private String phoneNumber;
    private double registrationFee;
    private double subscription;



}
