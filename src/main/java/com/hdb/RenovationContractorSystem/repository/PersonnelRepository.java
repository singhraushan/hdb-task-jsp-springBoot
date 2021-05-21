package com.hdb.RenovationContractorSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdb.RenovationContractorSystem.entities.Personnel;

@Repository
public interface PersonnelRepository extends JpaRepository<Personnel, Integer> {
	List<Personnel> findByUserId(String userId);
	List<Personnel> findByCompanyIdAndIsActive(int companyId, boolean isActive);
	List<Personnel> findByIsActive(boolean isActive);
}
