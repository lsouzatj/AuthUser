package com.ead.authUser.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
	
	@Column(nullable = false, unique = true, length = 50)
	private String userName;
	
	@Column(nullable = false, unique = true, length = 50)
	private String email;
	
	@Column(nullable = false, length = 10)
	private String password;
	
	@Column(nullable = false, length = 150)
	private String fullName;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private UserStatus userStatus;
	
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private UserType userType;

	@Column(length = 20)
	private String phoneNumber;
	
	@Column(length = 20)
	private String cpf;
	
	private String imageUrl;

	@Column(nullable = false)
	private LocalDateTime creationDate;
	
	@Column(nullable = false)
	private LocalDateTime lastUpdateDate;
}
