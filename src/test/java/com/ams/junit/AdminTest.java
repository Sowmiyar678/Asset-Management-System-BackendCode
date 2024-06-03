//package com.ams.junit;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.ResponseEntity;
//import org.testng.Assert;
//
//import com.ams.controller.AdminController;
//import com.ams.entity.Admin;
//
//@SpringBootTest
//class AdminTest {
//	
//	List<Admin> list=new ArrayList<>();
//	List<Admin> list1=new ArrayList<>();
//	Admin ams;
//	Admin ams2;
//
//	@Autowired
//	AdminController admincontroller;
//	
//	String insert;
//	String delete;
//	String update;
//	ResponseEntity<String> result;
//	String result1;
//	@Test
//	void registrationtest() {
//		Admin admin=new Admin();
//		admin.setName("sathish");
//		admin.setEmail("sathish@gmail.com");
//		admin.setPassword("sathish@123");
//		admin.setPhoneno("8987678987");
//		admin.setLocation("chennai");
//		insert="Admin registered successfully!";
//		ResponseEntity<String> response = admincontroller.register(admin);
//		String result = response.getBody();
//		Assert.assertEquals(insert, result);
//	}
//	
//	@Test
//	void performlogin() throws Exception{
//		Admin admin=new Admin();
//		admin.setEmail("sowmiya19122001@gmail.com");
//		admin.setPassword("Sowmiya@555");
//		insert="login";
//		ResponseEntity<String> response = admincontroller.login(admin);
//		String result = response.getBody();
//		Assert.assertEquals(insert, result);
//	}
//
//	
//	@Test
//	void performgetall() {
//		list=admincontroller.getAllAdmin();
//		ams=new Admin((long) 1,"sowmiya19122001@gmail.com"
//				,"chennai","sowmiya","Sowmiya@555","890966788");
//	list.equals(ams);
//	}
//	
//	
//	
//
//	
//	
//	
//
//}
