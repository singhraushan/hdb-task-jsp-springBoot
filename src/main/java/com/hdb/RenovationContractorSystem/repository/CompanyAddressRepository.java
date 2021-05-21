package com.hdb.RenovationContractorSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdb.RenovationContractorSystem.entities.CompanyAddress;

@Repository
public interface CompanyAddressRepository extends JpaRepository<CompanyAddress,Integer>{

}
