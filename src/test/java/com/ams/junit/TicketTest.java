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
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.testng.Assert;
//
//import com.ams.controller.AdminController;
//import com.ams.controller.EmployeeController;
//import com.ams.controller.ITTeamController;
//import com.ams.controller.TicketController;
//import com.ams.entity.Admin;
//import com.ams.entity.Employee;
//import com.ams.entity.ITTeam;
//import com.ams.entity.Ticket;
//
//@SpringBootTest
//class TicketTest {
//	
//	List<Ticket> list=new ArrayList<>();
//	List<Ticket> list1=new ArrayList<>();
//	Ticket ams;
//	Ticket ams2;
//
//	@Autowired
//	TicketController ticketcontroller;
//	
//	@Autowired
//	ITTeamController itTeamController;
//	
//	@Autowired
//	AdminController adminController; 
//	
//	@Autowired
//	EmployeeController employeeController;
//	
//	@Test
//	void performInsertTicket() {
//	    Ticket ticket = new Ticket();
//	    ticket.setDescription("mouse");
//	    ticket.setLocation("chennai");
//	    ticket.setPriority("High");
//	    ticket.setStatus("Open");
//	    ticket.setProject("workstation");
//	    Employee employee = new Employee();
//	    employee.setEmpid(1l);
//	    ticket.setEmployee(employee);
//	    ITTeam itteam=new ITTeam();
//	    itteam.setItteamid(1l);
//	    ticket.setItteam(itteam);
//	    Admin admin=new Admin();
//	    admin.setAdminid(1l);
//	    ticket.setAdmin(admin);
//	    String msg ="Ticket Raised";
//	    Object result = ticketcontroller.addticket(ticket);
//	    Assert.assertEquals(msg, result);
//	}
//
//	@Test
//	void performgetall() {
//		list=ticketcontroller.getAllTicket();
//		ams=new Ticket((long) 1,"sowmiya19122001@gmail.com"
//				,"chennai","sowmiya","Sowmiya@555","890966788");
//	list.equals(ams);
//	}
//	
//	   @Test
//   void performUpdate() {
//       Ticket ticket = new Ticket();
//       ticket.setId(44l);
//       ticket.setDescription("update");
//       ticket.setLocation("chennai");
//       ticket.setPriority("high");
//       ticket.setProject("workstation");
//       ticket.setStatus("open");
//       Employee employee = new Employee();
//       employee.setEmpid(1l);
//       ticket.setEmployee(employee);
//       Admin admin=new Admin();
//       admin.setAdminid(1l);
//       ticket.setAdmin(admin);
//       ITTeam itteam=new ITTeam();
//       itteam.setItteamid(1l);
//       ticket.setItteam(itteam);
//       ResponseEntity<?> response = ticketcontroller.updateAdmin(ticket.getId(), ticket);
//       assertNotNull(response);
//       assertEquals(HttpStatus.OK, response.getStatusCode());
//   }
//	
//	
//	
//	
//}
