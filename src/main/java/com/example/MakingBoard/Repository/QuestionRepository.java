package com.example.MakingBoard.Repository;

import com.example.MakingBoard.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
