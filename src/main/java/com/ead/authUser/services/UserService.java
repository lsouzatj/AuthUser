package com.ead.authUser.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.ead.authUser.models.UserModel;

public interface UserService {

	boolean existsUserByUserName(String userName);

	boolean existsByEmail(String email);

	void save(UserModel userModel);

	Optional<List<UserModel>> findAll();

	Optional<UserModel> findById(UUID userId);

}
