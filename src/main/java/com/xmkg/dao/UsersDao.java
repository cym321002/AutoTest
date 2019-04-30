package com.xmkg.dao;


import org.springframework.data.jpa.repository.JpaRepository;


import com.xmkg.entity.Users;

public interface UsersDao extends JpaRepository<Users, Integer>{
	
}
