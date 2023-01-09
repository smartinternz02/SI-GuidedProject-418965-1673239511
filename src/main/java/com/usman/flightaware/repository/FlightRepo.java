package com.usman.flightaware.repository;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.usman.flightaware.models.User;
import com.usman.flightaware.models.UserIp;

@Repository
public interface FlightRepo extends JpaRepository<UserIp, Long> {
	
}