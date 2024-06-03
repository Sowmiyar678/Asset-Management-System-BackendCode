package com.ams.controller;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ams.entity.Employee;
import com.ams.entity.Ticket;
import com.ams.serviceImpl.TicketserviceImpl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@RestController
@CrossOrigin("http://localhost:3000/")
public class TicketController {

	@Autowired
	TicketserviceImpl dao;
	
	
	@Autowired
	EntityManager eman;

	@Autowired
	JavaMailSender emailsender;

	@PostMapping("/CreateTicket")
	public Object addticket(@RequestBody Ticket ticket) {
		String msg = "";
		try {
			
			Query<Employee> query = (Query<Employee>) eman.createQuery("SELECT e FROM Employee e WHERE e.empid = :empid", Employee.class);
			query.setParameter("empid", ticket.getEmployee().getEmpid());
			Employee employee = query.getSingleResult();
			
			String email= employee.getEmail();
			
			System.out.println(email);
			

			SimpleMailMessage message = new SimpleMailMessage();
			message.setFrom("msvarshinee@gmail.com");
			message.setTo(email);
			message.setBcc("msvarshinee@gmail.com");
			message.setSubject("New Ticket...!!!");
			message.setText("Ticket has been raised");
			message.setText("Ticket Raised by the  email as ," +email+ " "
					+ "You can Use this Employee id to check the details" + " " + " Employee ID - " + " "
					+ ticket.getEmployee().getEmpid());

			emailsender.send(message);
			
			dao.addticket(ticket);

			msg = "Ticket Raised";
		} catch (Exception e) {
			
			System.out.println(e);
			
			msg = "Invalid ticket";
		}
		return msg;
	}

	@GetMapping("/GetAllTicket")
	public List<Ticket> getAllTicket() {
		try {
			return dao.getallTicket();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<?> updateAdmin(@PathVariable("id") Long id, @RequestBody Ticket updatedID) {

		
		return dao.updateID(id, updatedID);
	}
	
	
	

	@PutMapping("/updatestatus/{id}")
	public ResponseEntity<?> updatestatus(@PathVariable("id") Long id, @RequestBody Ticket updated) {
		
		Ticket getTicket=eman.find(Ticket.class, id);
		String email=getTicket.getEmployee().getEmail();
		
		System.out.println(email);
		
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("msvarshinee@gmail.com");
		message.setTo(email);
		message.setSubject("Ticket Update...!!!");
//		message.setText("Ticket Status update");
		message.setText("Ticket Raised by the  email as ," + email + " "
				+ "You can Use this Employee id to check the details" + " " + " Employee ID - " + getTicket.getEmployee().getEmpid());

		emailsender.send(message);
		
		
		
		return dao.updatestatus(id, updated);
	}
	
	
	

	@GetMapping("/GetTicketById/{id}")
	public Ticket getTicket(@PathVariable Long id) {
		try {
			return dao.getTicketById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@GetMapping("/GetAllIdTicket")
	public List<Ticket> loadFindAllTicket() {
		return (List<Ticket>) dao.findAll();
	}

	@GetMapping("/getEmployeeByid/{empid}")
	public List<Ticket> getByemployeeId(@PathVariable Long empid) {
		try {
			return dao.getByemployeeId(empid);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@GetMapping("/getITTeamByid/{itteamid}")
	public List<Ticket> getByitteamId(@PathVariable Long itteamid) {
		try {
			return dao.getByitteamId(itteamid);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
