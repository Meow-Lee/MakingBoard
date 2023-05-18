package com.example.MakingBoard.User;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class SiteUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true) // 값 중복 저장 못하게
    private String username;

    private String password;

    @Column(unique = true)
    private String email;
}
