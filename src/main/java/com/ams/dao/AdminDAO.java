package com.ams.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.ams.entity.Admin;
@Repository
public interface AdminDAO  {
	
	public Object addadmin(Admin admin);
	public Object updateAdminInfo(Admin admin);
	 
    List<Admin> getallAdmin();
 
    
	
    List<Admin> getAdminById(Long id);

    Optional<Admin> findbyemail(String email);

	
	List<Long> getAdminIdlist();

 




	
	

	
}
