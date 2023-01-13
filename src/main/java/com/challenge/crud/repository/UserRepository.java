package com.challenge.crud.repository;

import com.challenge.crud.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {

  Boolean existsByEmail(String email);
  Boolean existsByPhone(String phone);

}
