package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@ToString
@Getter
@Entity
public class PaymentEntity {

    @Id
    private String paymentId;
    private double amount;
    private LocalDate payDate;

}
