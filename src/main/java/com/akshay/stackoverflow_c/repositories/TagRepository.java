package com.akshay.stackoverflow_c.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.akshay.stackoverflow_c.models.Tag;

@Repository
public interface TagRepository extends CrudRepository <Tag, Long> {
	
	List<Tag> findAll();

}
