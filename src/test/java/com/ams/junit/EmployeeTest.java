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
//import com.ams.controller.EmployeeController;
//import com.ams.entity.Employee;
//
//@SpringBootTest
//class EmployeeTest {
//	
//@Autowired
//private EmployeeController employeecontroller;
//
//List<Employee> list1=new ArrayList<>();
//List<Employee> lis2= new ArrayList<>();
//Employee enroll;
//Employee enroll2;
//
//
//String insert;
//ResponseEntity<?> result;
//
//@Test
//void performInsert() {
//	Employee employee = new Employee();
//	employee.setName("deepi");
//	employee.setEmail("deepi@gmail.com");
//	employee.setPassword("deepi@123");
//	employee.setLocation("chennai");
//	employee.setPhoneno("8978976787");
//	insert="Employee registered successfully!";
//	ResponseEntity<String> response = employeecontroller.register(employee);
//	String result = response.getBody();
//	Assert.assertEquals(insert, result);
//}
//
//@Test
//void performfindemployee() {
//    List<Employee> employee = employeecontroller.getEmp(1l);
//    System.out.println(employee);
//    assertNotNull(employee);
//}
//
//
//	@Test
//	void Perfromgetall() {
//		list1=employeecontroller.getAllEmployee();
//		assertNotNull(list1);
//	}
//
//@Test
//void performupdate() {
//	Employee employee=new Employee();
//	employee.setEmpid(1l);
//	employee.setEmail("Deepagmail.com");
//	employee.setPassword("Deepa@123");
//	employee.setLocation("chennaii");
//	employee.setPhoneno("1234567878");
//    System.out.println(employee);
//    result=employeecontroller.updateEmployee(1l, employee);
//    Assert.assertNotNull(employee);
//    
//}
//
//
//
//
//
//
//}