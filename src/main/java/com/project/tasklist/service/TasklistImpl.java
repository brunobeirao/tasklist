package com.project.tasklist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.tasklist.model.Tasklist;
import com.project.tasklist.repository.TasklistRepository;

@Service
public class TasklistImpl implements TasklistService{
	
	@Autowired
	private TasklistRepository tasklistRepository;

	@Override
	public Tasklist saveTask(Tasklist task) {
		return tasklistRepository.save(task);
	}

	@Override
	public Tasklist getTask(Integer id) {
		return tasklistRepository.findById(id);
	}

	@Override
	public void removeTask(Tasklist task) {
		tasklistRepository.delete(task);
	}

	@Override
	public List<Tasklist> getTasks() {
		return (List<Tasklist>) tasklistRepository.findAll();
	}

}
