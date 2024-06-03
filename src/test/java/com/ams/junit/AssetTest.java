//package com.ams.junit;
//
//
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
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
//import com.ams.controller.AssetController;
//import com.ams.controller.EmployeeController;
//import com.ams.entity.Asset;
//import com.ams.entity.Employee;
//@SpringBootTest
//class AssetTest {
//	
//	List<Asset> list = new ArrayList<>();
//	List<Asset> list1=new ArrayList<>();
//	Asset ams;
//	Asset ams2;
//
//	
//	@Autowired
//	private AssetController assetcontroller;
//	
//
//	@Autowired
//	private EmployeeController employeecontroller;
//	
//	String insert;
//	String update;
//	String result;
////	
//	@Test
//	void performAddTest() {
//		Asset asset=new Asset();
//		asset.setAssetname("ASR123");
//		asset.setExpirydate("12/12/2024");
//		asset.setManufacturename("dell");
//		asset.setProducttype("workstation");
//		asset.setStatus("active");
//		 Employee employee = new Employee();
//	        employee.setEmpid(1l);
//	        asset.setEmployee(employee);
//	    insert="Asset Object Saved";
//		result=assetcontroller.addasset(asset);
//		Assert.assertEquals(insert, result);
//		
//	}
//	
//	@Test
//	void Getallasset() {
//		list=assetcontroller.getAllAsset();
//		assertNotNull(list);
//	}
//	
//
//	@Test
//	void performfindasset() {
//	    List<Asset> assets = new ArrayList<>();
//	    assets = assetcontroller.getAsset((long) 5);
//	    System.out.println(assets);
//	    assertNotNull(assets);
//	}
//	
//	   @Test
//	    void performUpdate() {
//	        Asset asset = new Asset();
//	        asset.setAssetid(5l);
//	        asset.setAssetname("wer3456");
//	        asset.setExpirydate("1/1/1");
//	        asset.setManufacturename("Acer");
//	        asset.setProducttype("workStations");
//	        asset.setStatus("ACTIve");
//	        Employee employee = new Employee();
//	        employee.setEmpid(1l);
//	        asset.setEmployee(employee);
//	        
//	        
//	        ResponseEntity<?> response = assetcontroller.updateAsset(asset.getAssetid(), asset);
//	        
//	       
//	        assertNotNull(response);
//	        assertEquals(HttpStatus.OK, response.getStatusCode());
//	    }
//	
//	
//	
//	
//	}
//	
//	
//	
//	