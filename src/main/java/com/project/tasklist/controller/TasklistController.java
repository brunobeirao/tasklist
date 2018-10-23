package com.project.tasklist.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.tasklist.model.Tasklist;
import com.project.tasklist.repository.TasklistRepository;
import com.project.tasklist.service.TasklistService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/tasklist")
@Api(value = "API")
public class TasklistController {

	@Autowired
	private TasklistRepository tasklistRepository;
	
	@Autowired
	private TasklistService tasklistService;
	
	@InitBinder     
	public void initBinder(WebDataBinder binder){
	     binder.registerCustomEditor(       Date.class,     
	                         new CustomDateEditor(new SimpleDateFormat("dd/MM/yyyy"), true, 10));   
	}
	
	public TasklistController(TasklistRepository tasklistRepository) {
		this.tasklistRepository = tasklistRepository;
	}
	@CrossOrigin(origins = "http://localhost:8000")
	@GetMapping("/list")
	@ApiOperation(value = "List of tasks")
	public ResponseEntity<List<Tasklist>> getTasks(){
		
		List<Tasklist> tasks = tasklistService.getTasks();
		if (tasks.isEmpty()){
			return new ResponseEntity(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Tasklist>>(tasks, HttpStatus.OK);
		
	}
	
	@GetMapping("/add")
	@ApiOperation(value = "Add tasks")
	public @ResponseBody String addNewTask (@RequestParam String titulo, @RequestParam String descricao, 
			@RequestParam String status) {

		Date date = new Date();
		Tasklist task = new Tasklist();

		task.setTitulo(titulo);
		task.setDescricao(descricao);
		task.setStatus(status);
		task.setDateCriacao(date);
		tasklistRepository.save(task);
		return "Salvo";
	}
	@PutMapping("/update/{id}")
	@ApiOperation(value = "Update task")
	public String updateTask(@PathVariable(value = "id") Integer id, @RequestParam String titulo, @RequestParam String descricao, 
			@RequestParam String status) {
		
		Date date = new Date();
		Tasklist currentTask = tasklistService.getTask(id);
		
//		if (currentTask == null) {
//			return new ResponseEntity(new CustomErrorType("Unable to update. User with id " 
//					+ id +" not found"), HttpStatus.NOT_FOUND);
//		}
		
		currentTask.setTitulo(titulo);
		currentTask.setDescricao(descricao);
		currentTask.setStatus(status);
		currentTask.setDateCriacao(date);
		
		tasklistService.saveTask(currentTask);
		return "edited";
	}
	
	@DeleteMapping("/delete/{id}")
	@ApiOperation(value = "Delete task")
	public String deleteTask(@PathVariable(value = "id") Integer id) {
		Tasklist note = tasklistRepository.findById(id);
		tasklistService.removeTask(note);
		return "Done";
	}
}
