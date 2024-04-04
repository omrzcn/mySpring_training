package com.cydeo.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mentor {
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private boolean graduated;
    private String batch;
    private  String company;
}
