package com.ead.authUser.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ead.authUser.enums.UserStatus;
import com.ead.authUser.enums.UserType;

import lombok.Data;

@Data
@Entity
@Table(name = "TB_USERS")
public final class UserModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID userId;
	private String userName;
	private String email;
	private String password;
	private String fullName;
	private UserStatus userStatus;
	private UserType userType;
	private String phoneNumber;
	private String cpf;
	private String imageUrl;
	private LocalDateTime creationDate;
	private LocalDateTime lastUpdateDate;
}
