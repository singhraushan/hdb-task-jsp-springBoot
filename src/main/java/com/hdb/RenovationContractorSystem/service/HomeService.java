package com.hdb.RenovationContractorSystem.service;

import java.util.List;

import com.hdb.RenovationContractorSystem.dto.ABCSystemDataDto;
import com.hdb.RenovationContractorSystem.dto.UserDto;
import com.hdb.RenovationContractorSystem.entities.CompanyAddress;
import com.hdb.RenovationContractorSystem.entities.CompanyParticular;
import com.hdb.RenovationContractorSystem.entities.Personnel;

public interface HomeService {

	String authenticate(UserDto userdto);

	Personnel getPersonnel(String userId);

	void updatePersonnel(Personnel personnel);

	List<CompanyParticular> getCompanyParticular();

	List<CompanyAddress> getCompanyAddress();
	CompanyAddress getCompanyAddress(int id);

	void updateCompanyAddress(CompanyAddress companyAddress);
	
	List<Personnel> getActivePersonInCompany(int hdbRegistrationNumber);

	void deActivatePersonnel(int identityNumber);
	List<ABCSystemDataDto>  getAllActivatePersonnel();

}
