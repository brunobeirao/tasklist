package com.project.tasklist.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.tasklist.model.Tasklist;

@Repository
public interface TasklistRepository extends CrudRepository<Tasklist, Long> {

	Tasklist findById(Integer id);
	
//	public Takslist insert(Takslist firstName);


}