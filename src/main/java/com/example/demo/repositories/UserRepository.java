package com.example.demo.repositories;

import com.example.demo.domains.UserDto;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {

	int insert(UserDto user);
	UserDto login(UserDto user);
	UserDto selectById(String userid);
	int update(UserDto user);
	int delete(UserDto user);
}
