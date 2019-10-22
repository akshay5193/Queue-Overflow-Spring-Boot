package com.akshay.stackoverflow_c.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.akshay.stackoverflow_c.models.Answer;

@Repository
public interface AnswerRepository extends CrudRepository <Answer, Long> {
	
	List<Answer> findAll();

}
