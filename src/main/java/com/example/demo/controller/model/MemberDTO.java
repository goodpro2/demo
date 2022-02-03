package com.example.demo.controller.model;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class MemberDTO {
    private String name;
    private String email;
    private String organization;

    @Override
    public String toString() {
        return "memberDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", organization='" + organization + '\'' +
                '}';
    }

}
