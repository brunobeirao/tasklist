package com.project.tasklist.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.tasklist.model.Tasklist;

@Repository
public interface TasklistRepository extends CrudRepository<Tasklist, Long> {

	Tasklist findById(Integer id);
	
	@Query("SELECT t FROM Tasklist t WHERE dateRemocao IS NULL")
    List<Tasklist> getTasks();

}