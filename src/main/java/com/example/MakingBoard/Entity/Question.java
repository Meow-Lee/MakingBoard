package com.example.MakingBoard.Entity;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
public class Question {
    @Id // 기본 키
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 고유 번호 생성
    private Integer id;

    @Column(length = 200) // 길이 지정
    private String subject;

    @Column(columnDefinition = "TEXT") // 내용과 같이 제한 없을 때 사용
    private String content;

    private LocalDate createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;
}
