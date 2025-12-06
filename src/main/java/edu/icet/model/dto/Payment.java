package edu.icet.model.dto;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@ToString
@Getter
public class Payment {

    private String paymentId;
    private double amount;
    private LocalDate payDate;

}
