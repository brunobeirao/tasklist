package com.project.tasklist.service;

import java.util.List;

import com.project.tasklist.model.Tasklist;

public interface TasklistService {
	
	public Tasklist saveTask(Tasklist task);
	public Tasklist getTask(Integer id);
	public List<Tasklist> getTasks();
	public void removeTask(Tasklist note);
	
}