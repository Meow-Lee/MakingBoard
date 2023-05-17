package com.example.MakingBoard.Question;

import com.example.MakingBoard.Answer.Answer;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Question {
    @Id // 기본 키
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 고유 번호 생성
    private Integer id;

    @Column(length = 200) // 길이 지정
    private String subject;

    @Column(columnDefinition = "TEXT") // 내용과 같이 제한 없을 때 사용
    private String content;

    private LocalDateTime createDate;

    @OneToMany(mappedBy = "question", cascade = CascadeType.REMOVE)
    private List<Answer> answerList;
}
