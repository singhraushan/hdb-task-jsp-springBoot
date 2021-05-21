package com.hdb.RenovationContractorSystem.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hdb.RenovationContractorSystem.dto.ABCSystemDataDto;
import com.hdb.RenovationContractorSystem.dto.UserDto;
import com.hdb.RenovationContractorSystem.entities.CompanyAddress;
import com.hdb.RenovationContractorSystem.entities.CompanyParticular;
import com.hdb.RenovationContractorSystem.entities.Personnel;
import com.hdb.RenovationContractorSystem.entities.User;
import com.hdb.RenovationContractorSystem.repository.CompanyAddressRepository;
import com.hdb.RenovationContractorSystem.repository.CompanyParticularRepository;
import com.hdb.RenovationContractorSystem.repository.PersonnelRepository;
import com.hdb.RenovationContractorSystem.repository.UserRepository;

@Service
@Transactional
public class HomeServiceImpl implements HomeService {
	
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PersonnelRepository personnelRepository;
	
	@Autowired
	private CompanyParticularRepository companyParticularRepository;
	
	@Autowired
	private CompanyAddressRepository companyAddressRepository;

	@Override
	public String authenticate(UserDto userdto) {
		Optional<User> user = userRepository.findById(userdto.getUserId());
		if(user.isPresent() && user.get().getPassword().equals(userdto.getPassword())){
		return "success";	
		}else{
			return "error";
		}
	}

	@Override
	public Personnel getPersonnel(String userId) {
		List<Personnel> res = personnelRepository.findByUserId(userId);
		if(res!=null && res.size()>0){
			return res.get(0);
		}
		return null;
	}

	@Override
	public void updatePersonnel(Personnel personnel) {
		personnelRepository.save(personnel);
	}

	@Override
	public List<CompanyParticular> getCompanyParticular() {
		return companyParticularRepository.findAll();
	}

	@Override
	public List<CompanyAddress> getCompanyAddress() {
		return companyAddressRepository.findAll();
	}
	
	@Override
	public CompanyAddress getCompanyAddress(int id) {
		return companyAddressRepository.getOne(id);
	}

	@Override
	public void updateCompanyAddress(CompanyAddress companyAddress) {
		companyAddressRepository.save(companyAddress);
	}
	
	@Override
	public List<Personnel> getActivePersonInCompany(int hdbRegistrationNumber) {
		return personnelRepository.findByCompanyIdAndIsActive(hdbRegistrationNumber,true);
	}
	
	@Override
	public void deActivatePersonnel(int identityNumber) {
		Optional<Personnel> optional = personnelRepository.findById(identityNumber);
		if(optional.isPresent()){
			Personnel personnel = optional.get();
			personnel.setIsActive(false);
			personnel.setDateOfResignation(LocalDate.now());
			personnelRepository.save(personnel);
		}
	}

	@Override
	public List<ABCSystemDataDto> getAllActivatePersonnel() {
		 List<Personnel> personnels = personnelRepository.findByIsActive(true);
		 List<CompanyParticular> companyParticulars = companyParticularRepository.findAll();
		 
		 List<ABCSystemDataDto> res = new ArrayList<>();
		 for(Personnel p :personnels){
			 ABCSystemDataDto abc = new ABCSystemDataDto();
			 abc.setAppointment(p.getAppointment());
			 abc.setCompanyName(companyParticulars.stream().filter(e->e.getHdbRegistrationNumber()==p.getCompanyId()).findFirst().get().getCompanyName());
			 abc.setIdentityNumber(p.getIdentityNumber());
			 abc.setMobileNumber(p.getMobileNumber());
			 abc.setPersonnelName(p.getPersonnelName());
			 res.add(abc);
		 }
		 return res;
		 
	}
	
	
	
	

}
