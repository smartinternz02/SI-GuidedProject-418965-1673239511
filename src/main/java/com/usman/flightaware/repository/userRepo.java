package com.usman.flightaware.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.usman.flightaware.models.User;
import com.usman.flightaware.models.UserIp;


public interface userRepo extends JpaRepository<User,Long> {

	User findByEmailIdIgnoreCase(String email);
	

}