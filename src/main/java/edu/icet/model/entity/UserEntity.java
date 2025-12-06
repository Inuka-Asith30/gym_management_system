package edu.icet.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor
@ToString
@Entity
public class UserEntity {

    @Id
    private String userId;
    private String userName;
    private String password;
    private String role;


}
