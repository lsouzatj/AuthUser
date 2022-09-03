package com.ead.authUser.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ead.authUser.models.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, UUID>{

}
