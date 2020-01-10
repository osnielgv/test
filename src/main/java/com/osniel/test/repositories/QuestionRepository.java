package com.osniel.test.repositories;

import com.osniel.test.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
