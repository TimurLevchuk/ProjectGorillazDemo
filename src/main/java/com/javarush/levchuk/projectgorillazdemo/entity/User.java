package com.javarush.levchuk.projectgorillazdemo.entity;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {
    private Long id;
    private String login;
    private String password;
    private Role role;
    public String getImage(){
        return "image-" + id;
    }
}
