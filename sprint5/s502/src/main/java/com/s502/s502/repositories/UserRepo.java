package com.s502.s502.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.s502.s502.models.UserModel;

public interface UserRepo extends JpaRepository<UserModel, Long>{
	public abstract UserModel findByEmail(String email);
}
