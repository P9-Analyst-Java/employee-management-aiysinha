package com.deloitte.ms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.deloitte.ms.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, String>{

	@Query(value="select * from customer c where c.userName = :username", nativeQuery=true)
	public List<User> getAllCustomerBasedOnUsername(String username);

}

