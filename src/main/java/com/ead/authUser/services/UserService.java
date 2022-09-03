package com.ead.authUser.services;

import com.ead.authUser.models.UserModel;

public interface UserService {

	boolean existsUserByUserName(String userName);

	boolean existsByEmail(String email);

	void save(UserModel userModel);

}
