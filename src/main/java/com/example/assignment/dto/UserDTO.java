package com.example.assignment.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Integer id;

    private String hoTen;

    private Integer gioiTinh;


    private String email;
    private String username;

    private String password;

    private Integer role;
}
