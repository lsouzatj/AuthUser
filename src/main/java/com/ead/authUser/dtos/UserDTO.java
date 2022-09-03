package com.ead.authUser.dtos;

import java.util.UUID;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class UserDTO {

	private UUID userId;

	@NotBlank(message = "{userName.notBlank}")
	@Size(min = 4, max = 50, message = "{userName.size}")
	private String userName;
	
	@NotBlank(message = "{email.notBlank}")
	@Email(message = "{email.format}")
	private String email;

	@NotBlank(message = "{password.notBlank}")
	@Size(min = 4, max = 10, message = "{password.size}")
	private String password;

	@Size(min = 4, max = 10, message = "{password.size}")
	private String oldPassword;
	
	private String fullName;
	
	private String phoneNumber;

	private String cpf;
	
	private String imageUrl;
}
