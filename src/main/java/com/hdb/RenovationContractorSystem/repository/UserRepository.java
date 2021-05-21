package com.hdb.RenovationContractorSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdb.RenovationContractorSystem.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
