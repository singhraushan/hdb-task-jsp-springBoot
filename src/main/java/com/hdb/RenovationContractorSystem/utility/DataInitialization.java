package com.hdb.RenovationContractorSystem.utility;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hdb.RenovationContractorSystem.entities.CompanyAddress;
import com.hdb.RenovationContractorSystem.entities.CompanyParticular;
import com.hdb.RenovationContractorSystem.entities.Personnel;
import com.hdb.RenovationContractorSystem.entities.User;
import com.hdb.RenovationContractorSystem.repository.CompanyAddressRepository;
import com.hdb.RenovationContractorSystem.repository.CompanyParticularRepository;
import com.hdb.RenovationContractorSystem.repository.PersonnelRepository;
import com.hdb.RenovationContractorSystem.repository.UserRepository;

@Component
public class DataInitialization {

	@Autowired
	private  UserRepository userRepository;
	
	public  void loadUserData(){
		List<User> list = new ArrayList<>();
		User user1 =new User();
		user1.setUserId("user1");
		user1.setPassword("12345");
		
		User user2 =new User();
		user2.setUserId("user2");
		user2.setPassword("12345");
		
		list.add(user1);
		list.add(user2);
		
		userRepository.saveAll(list);
		System.out.println("user Data saved into DB:"+list);
	}
	
	@Autowired
	private PersonnelRepository personnelRepository;
	
	public  void loadPersonnelData(){
		List<Personnel> list = new ArrayList<>();
		Personnel personnel1 =new Personnel();
		personnel1.setIsActive(true);
		personnel1.setAppointment("Employee");
		personnel1.setCompanyId(1);//hdbRegistrationNumber
		personnel1.setDateOfAppointment(LocalDate.of(2021, 6, 1));
		personnel1.setDateOfResignation(null);
		personnel1.setEmailAddress("abc@gmail.com");
		//personnel1.setIdentityNumber();//auto generated
		personnel1.setMobileNumber(90361234);
		personnel1.setPersonnelName("Ram");
		personnel1.setStatus("Employed");
		personnel1.setUserId("user1");
		list.add(personnel1);
		
		Personnel personnel2 =new Personnel();
		personnel2.setIsActive(true);
		personnel2.setAppointment("Director");
		personnel2.setCompanyId(2);//hdbRegistrationNumber
		personnel2.setDateOfAppointment(LocalDate.of(2020, 6, 1));
		personnel2.setDateOfResignation(null);
		personnel2.setEmailAddress("def@gmail.com");
		//personnel2.setIdentityNumber();//auto generated
		personnel2.setMobileNumber(12345678);
		personnel2.setPersonnelName("Shyam");
		personnel2.setStatus("Employed");
		personnel2.setUserId("user2");
		list.add(personnel2);
		
		personnelRepository.saveAll(list);
		System.out.println("personnel Data saved into DB:"+list);
	}
	
	@Autowired
	private CompanyParticularRepository companyParticularRepository;
	
	public void loadCompanyParticularData(){
		List<CompanyParticular> list = new ArrayList<>();
		CompanyParticular companyParticular1 =new CompanyParticular();
		companyParticular1.setBusinessRegistrationEffectiveDate(LocalDate.of(1980, 1, 15));
		companyParticular1.setBusinessRegistrationExpiryDate(LocalDate.of(2030, 1, 15));
		companyParticular1.setBusinessRegistrationNumber("SG-R-101");
		companyParticular1.setCompanyName("Crafting Ptv ltd");
		//companyParticular1.setHdbRegistrationNumber();//auto generated
		companyParticular1.setModeOfBusiness("Private Limited");
		list.add(companyParticular1);
		
		
		CompanyParticular companyParticular2 =new CompanyParticular();
		companyParticular2.setBusinessRegistrationEffectiveDate(LocalDate.of(2019, 1, 1));
		companyParticular2.setBusinessRegistrationExpiryDate(LocalDate.of(2022, 1, 1));
		companyParticular2.setBusinessRegistrationNumber("SG-R-102");
		companyParticular2.setCompanyName("WSH Experts");
		//companyParticular2.setHdbRegistrationNumber();//auto generated
		companyParticular2.setModeOfBusiness("Contract");
		list.add(companyParticular2);
		
		companyParticularRepository.saveAll(list);
		System.out.println("CompanyParticular Data saved into DB:"+list);
	}
	
	@Autowired
	private CompanyAddressRepository companyAddressRepository;
	
	public void loadCompanyAddressData(){
		List<CompanyAddress> list = new ArrayList<>();
		CompanyAddress companyAddress1 =new CompanyAddress();
		companyAddress1.setBlockNumber("509");
		companyAddress1.setBuildingName("Cresent");
		//companyAddress1.setId();//auto generated
		companyAddress1.setStreetName("Ang mo kio, ave 8");
		companyAddress1.setUnitLevel("12");
		companyAddress1.setUnitNumber("2036");
		companyAddress1.setCompanyId(1);
		list.add(companyAddress1);
		
		CompanyAddress companyAddress2 =new CompanyAddress();
		companyAddress2.setBlockNumber("170");
		companyAddress2.setBuildingName("ABC");
		//companyAddress1.setId();//auto generated
		companyAddress2.setStreetName("Pasir Panjang Raod");
		companyAddress2.setUnitLevel("2");
		companyAddress2.setUnitNumber("170");
		companyAddress2.setCompanyId(2);
		list.add(companyAddress2);
		
		companyAddressRepository.saveAll(list);
		System.out.println("CompanyAddress Data saved into DB:"+list);
	}
}
