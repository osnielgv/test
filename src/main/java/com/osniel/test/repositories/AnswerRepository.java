package com.osniel.test.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.osniel.test.entities.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {

	@Query("select a from Answer a inner join a.question q WHERE q.id = ?1")
	public List<Answer> findByQuestionId(Long questionId);

}
