package com.ead.authUser.dtos;

import java.util.UUID;

import lombok.Data;

@Data
public class UserDTO {

	private UUID userId;
	private String userName;
	private String email;
	private String password;
	private String oldPassword;
	private String fullName;
	private String phoneNumber;
	private String cpf;
	private String imageUrl;
}
