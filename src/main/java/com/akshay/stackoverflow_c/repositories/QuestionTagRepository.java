package com.akshay.stackoverflow_c.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.akshay.stackoverflow_c.models.QuestionTag;

@Repository
public interface QuestionTagRepository extends CrudRepository <QuestionTag, Long> {
	
	List <QuestionTag> findAll();

}
