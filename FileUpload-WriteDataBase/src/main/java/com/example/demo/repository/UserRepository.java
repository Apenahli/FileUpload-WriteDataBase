package com.example.demo.repository;


import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.User;


public interface UserRepository extends CrudRepository<User, Long> {

	User findByUsername(String username);

	@Transactional
	@Modifying
	@Query(value = " update g.user set password=:password where id=:id", nativeQuery = true)
	void updatePassword(@Param("password") String password, @Param("id") Long id);
	
	
	

	
	

}
