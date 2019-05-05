package com.xmkg.dao.one;


import org.springframework.data.jpa.repository.JpaRepository;

import com.xmkg.entity.one.Users;

public interface UsersDao extends JpaRepository<Users, Integer>{
	
}
