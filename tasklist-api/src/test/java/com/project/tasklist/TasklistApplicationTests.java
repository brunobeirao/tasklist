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

@RunWith(SpringRunner.class)
@SpringBootTest
public class TasklistApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@MockBean
	private TasklistController tasklistController;

	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		this.setMockMvc(MockMvcBuilders.standaloneSetup(tasklistController).build());
	}

	public MockMvc getMockMvc() {
		return mockMvc;
	}

	public void setMockMvc(MockMvc mockMvc) {
		this.mockMvc = mockMvc;
	}
}
