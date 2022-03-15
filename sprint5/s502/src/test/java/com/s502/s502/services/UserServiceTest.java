package com.s502.s502.services;


import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;

import com.s502.s502.models.UserModel;
import com.s502.s502.repositories.UserRepo;

public class UserServiceTest {

	@Mock 
	private UserRepo userRepo;
	//@InjectMocks
	private UserServices userService;

	@BeforeEach
	  void initUseCase() {
	    userService = new UserServices(userRepo);
	  }
	
	@Test
	@DisplayName("Test should past when the data for register user is complete")
	void registerUser() {
		//userService = new UserServices(userRepo);
		long id = 1;
		UserModel user = new UserModel(id, "julio", "Berne", new Date());
		
		Mockito.when(userService.createUser(user)).thenReturn(user);
		assertThat(user.getNombre()).isNotNull();
		//fail("Not yet implemented");
	}

	private Object when(UserModel save) {
		// TODO Auto-generated method stub
		return null;
	}

}
