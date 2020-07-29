package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.model.User;

// jpaRepository---we get a bunch of CRUD methods for the user.
public interface UserRepository extends JpaRepository<User, Long>{

	
}
