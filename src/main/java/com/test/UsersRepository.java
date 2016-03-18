package com.test;

import java.util.List;

import org.springframework.data.repository.Repository;


public interface UsersRepository extends Repository<Users,Long>{
	
	List<Users> findAll();

}
