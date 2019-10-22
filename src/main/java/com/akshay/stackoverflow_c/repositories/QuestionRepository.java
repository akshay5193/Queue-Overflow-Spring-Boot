package com.akshay.stackoverflow_c.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.akshay.stackoverflow_c.models.Question;

@Repository
public interface QuestionRepository extends CrudRepository <Question, Long> {

	List<Question> findAll();
	
}
