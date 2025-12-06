package edu.icet.model.dto;

import lombok.*;

@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor
@ToString

public class User {

    private String userId;
    private String userName;
    private String password;
    private String role;


}
