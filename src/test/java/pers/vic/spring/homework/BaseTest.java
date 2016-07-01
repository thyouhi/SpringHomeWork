package pers.vic.spring.homework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * 测试基类
 * 
 * @author Vic.Zhao
 * @since 2016年6月30日
 */
public class BaseTest {
	
	@Autowired
	protected WebApplicationContext wac;
	
	protected MockMvc mockMvc;
	
	private Long startTime;
	
	private Long endTime;
	
	@Before
	public void before() throws Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
		startTime = System.currentTimeMillis();
	}
	
	@After
	public void after() throws Exception {
		endTime = System.currentTimeMillis();
		System.out.println("RunTime is " + (endTime - startTime));
	}
}
