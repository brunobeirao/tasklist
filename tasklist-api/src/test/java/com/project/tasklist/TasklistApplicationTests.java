package com.project.tasklist;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.project.tasklist.controller.TasklistController;

//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class TasklistApplicationTests {
//
//	@Test
//	public void contextLoads() {
//	}
//	
//	@MockBean
//	private TasklistController tasklistController;
//
//	private MockMvc mockMvc;
//	
//	@Before
//	public void setup() {
//		MockitoAnnotations.initMocks(this);
//		this.mockMvc = MockMvcBuilders.standaloneSetup(tasklistController).build();
//	}
	
//	@Test
//	public void load() throws Exception {
//		this.mockMvc.perform(get("/tasklist").contentType(MediaType.APPLICATION_JSON)).andExpect(status().isOk());
//	}
	
//	@Test
//	public void testPost() throws Exception {
//		this.mockMvc.perform(get("/tasklist/add").param("id", "3").param("titulo", "Tarefa1").param("descricao", "nenhuma").param("status", "OK").param("date_criacao", "2018-10-22 11:56:14")).andExpect(status().isOk());
//	}
	
//	@Test
//	public void test_create_user_success() throws Exception {
//		Takslist task = new Takslist();
//	    when(userService.exists(user)).thenReturn(false);
//	    doNothing().when(userService).create(user);
//	    mockMvc.perform(
//	            post("/users")
//	                    .contentType(MediaType.APPLICATION_JSON)
//	                    .content(asJsonString(user)))
//	            .andExpect(status().isCreated())
//	            .andExpect(header().string("location", containsString("http://localhost/users/")));
//	    verify(userService, times(1)).exists(user);
//	    verify(userService, times(1)).create(user);
//	    verifyNoMoreInteractions(userService);
//	}

//}
