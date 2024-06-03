package com.ams.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.ams.dao.TicketDAO;
import com.ams.entity.Ticket;
import com.ams.service.Ticketservice;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class TicketserviceImpl implements Ticketservice {

	@Autowired
	TicketDAO dao;

	@Autowired
	JavaMailSender emailsender;

	@PersistenceContext
	private EntityManager eman;

	@Override
	public List<Ticket> getallTicket() {

		return dao.getallTicket();
	}

	@Override
	public Ticket getTicketById(Long id) {
		return dao.getTicketById(id);
	}

	@Override
	public List<Ticket> findAll() {
		return dao.findAll();
	}

	@Override
	public ResponseEntity<?> updateID(long id, Ticket updatedTicket) {
		return dao.updateID(id, updatedTicket);
	}

	@Override
	public List<Ticket> getByemployeeId(Long empid) {

		return dao.getByemployeeId(empid);
	}

	@Override
	public List<Ticket> getByitteamId(Long itteamid) {

		return dao.getByitteamId(itteamid);
	}

	@Override
	public Object addticket(Ticket ticket) {

		return dao.addticket(ticket);
	}

	@Override
	public ResponseEntity<?> updatestatus(long ticketId, Ticket updatedTicket) {

		return dao.updatestatus(ticketId, updatedTicket);
	}

}
