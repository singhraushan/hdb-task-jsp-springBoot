package com.hdb.RenovationContractorSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hdb.RenovationContractorSystem.entities.CompanyParticular;

@Repository
public interface CompanyParticularRepository  extends JpaRepository<CompanyParticular,Integer>{

}
