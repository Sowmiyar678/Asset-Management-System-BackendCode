//package com.ams.junit;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.ResponseEntity;
//import org.testng.Assert;
//
//import com.ams.controller.ITTeamController;
//import com.ams.entity.ITTeam;
//
//@SpringBootTest
//class ITTeamTest {
//	
//	@Autowired
//	ITTeamController itTeamController;
//	
//
//	@Test
//	void performITTeamRegistration() {
//		ITTeam itteam = new ITTeam();
//		itteam.setName("ITTeam1");
//		itteam.setEmail("itteam1@gmail.com");
//		itteam.setPassword("ITTeam1@123");
//		itteam.setPhoneno("9876543210");
//		itteam.setLocation("Chennai");
//		String insert = "ITTeam registered successfully!";
//		ResponseEntity<String> result = itTeamController.register(itteam);
//		Assert.assertEquals(insert, result.getBody());
//	}
//	
//	@Test
//	void performITTeamLogin() {
//		ITTeam itteam = new ITTeam();
//		itteam.setEmail("itteam1@gmail.com");
//		itteam.setPassword("ITTeam1@123");
//		Map<String, Long> map = new HashMap<>();
//		map.put("userId",14L);
//		ResponseEntity<?> result = itTeamController.login(itteam);
//		Assert.assertEquals(map, result.getBody());
//	}
////	
//	@Test
//	void performGetITTeamById() {
//		Long itteamid = 1L;
//		List<ITTeam> itteamList = itTeamController.getITTeam(itteamid);
//		assertNotNull(itteamList);
//	}
//	
//	@Test
//	void performGetITTeamIdlist() {
//		List<Long> itteamIdList = itTeamController.getITTeamIdlist();
//		assertNotNull(itteamIdList);
//	}
//	
//	@Test
//	void performGetAllITTeam() {
//		List<ITTeam> itteamList = itTeamController.getallITTeam();
//		assertNotNull(itteamList);
//	}
//	
//
//}
