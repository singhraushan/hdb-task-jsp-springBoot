package com.hdb.RenovationContractorSystem.ctrl;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.hdb.RenovationContractorSystem.dto.ABCSystemDataDto;
import com.hdb.RenovationContractorSystem.dto.UserDto;
import com.hdb.RenovationContractorSystem.entities.CompanyAddress;
import com.hdb.RenovationContractorSystem.entities.CompanyParticular;
import com.hdb.RenovationContractorSystem.entities.Personnel;
import com.hdb.RenovationContractorSystem.service.HomeService;
import com.hdb.RenovationContractorSystem.utility.DataInitialization;

@Controller
public class HomeController {

	static boolean flag = true;
	@Autowired
	private HomeService homeService;
	
	@Autowired
	DataInitialization dataInitialization;

	
	@RequestMapping({ "", "/home" })
	public String home() {
		if(flag){
			dataInitialization.loadUserData();
			dataInitialization.loadPersonnelData();
			dataInitialization.loadCompanyParticularData();
			dataInitialization.loadCompanyAddressData();
			flag = false;
		}
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute UserDto userDto, Model model, HttpSession session) {

		System.out.println("login page: user:" + userDto);

		String response = homeService.authenticate(userDto);

		if (response.equalsIgnoreCase("success")) {
			session.setAttribute("userId", userDto.getUserId());
		} else {
			model.addAttribute("error", "wrong uername/password. Please provide correct.");
		}
		return response;
	}

	@RequestMapping(value = "/logout", method = RequestMethod.POST)
	public String logout(HttpSession session) {
		System.out.println("logout");
		session.invalidate();
		return "login";
	}

	@RequestMapping(value = "/updatePersonnel", method = RequestMethod.GET)
	public ModelAndView updatePersonnel(Model model, HttpSession session) {
		String userId = (String) session.getAttribute("userId");
		System.out.println("updatePersonnel: get: " + userId);

		Personnel p = homeService.getPersonnel(userId);
		if (p == null) {
			model.addAttribute("error", "Personnel details not available.");
			return new ModelAndView("error");
		}System.out.println("updatePersonnel: get: else p:" + p);
		return new ModelAndView("updatePersonnel", "p", p);
	}

	@RequestMapping(value = "/updatePersonnel", method = RequestMethod.POST)
	public String updatePersonnel(@ModelAttribute Personnel personnel, Model model) {
		System.out.println("updatePersonnel: post: " + personnel);
		homeService.updatePersonnel(personnel);
		return "success";
	}
	
	
	@RequestMapping(value = "/companyParticular", method = RequestMethod.GET)
	public ModelAndView companyParticular() {
		List<CompanyParticular> cps = homeService.getCompanyParticular();
		return new ModelAndView("companyParticular", "cps", cps);
	}

	
	@RequestMapping(value = "/updateCompanyAddress", method = RequestMethod.GET)
	public ModelAndView updateCompanyAddress() {
		
		List<CompanyAddress> cas = homeService.getCompanyAddress();
		
		return new ModelAndView("updateCompanyAddress", "cas", cas);
	}

	@RequestMapping(value="/editCompanyAddress/{id}")    
    public String editCompanyAddress(@PathVariable int id, Model m){    
		CompanyAddress ca = homeService.getCompanyAddress(id); 
        m.addAttribute("command",ca);  
        return "editCompanyAddress";    
    } 
	
	@RequestMapping(value="/editsave",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute CompanyAddress companyAddress){    
		homeService.updateCompanyAddress(companyAddress);    
        return "success";    
    } 
	
	@RequestMapping(value="/addPersonToCompany/{hdbRegistrationNumber}")    
    public String addPersonToCompany(@PathVariable int hdbRegistrationNumber, Model m){    
		int count = homeService.getActivePersonInCompany(hdbRegistrationNumber).size(); 
		if(count>7){
			m.addAttribute("error", "Already have "+count+" person for company hdbRegistrationNumber:"+hdbRegistrationNumber);
			return "personError";
		}
		m.addAttribute("companyId", hdbRegistrationNumber);
        return "addNewPerson";    
    }
	
	
	@RequestMapping(value="/addNewPersonnel",method = RequestMethod.POST)    
    public String addNewPersonnel(@ModelAttribute Personnel personnel){  
		System.out.println("addNewPersonnel personnel: "+personnel);
		homeService.updatePersonnel(personnel);    
        return "success";    
    }
	
	@RequestMapping(value="/removePersonFromCompany/{hdbRegistrationNumber}")    
    public String removePersonFromCompany(@PathVariable int hdbRegistrationNumber, Model m){    
		List<Personnel> personnels= homeService.getActivePersonInCompany(hdbRegistrationNumber); 
		if(personnels.size()<2){
			m.addAttribute("error", "Can't have less than "+personnels.size()+" person for company hdbRegistrationNumber:"+hdbRegistrationNumber);
			return "personError";
		}
		 m.addAttribute("personnels",personnels);  
        return "removePerson";    
    }
	
	@RequestMapping(value="/removePerson/{identityNumber}")    
    public String addNewPersonnel(@PathVariable int identityNumber){   
		System.out.println("start: removePerson identityNumber: "+identityNumber);
		homeService.deActivatePersonnel(identityNumber);    
		System.out.println("done: removePerson identityNumber: "+identityNumber);
        return "success";    
    }
	
	
	@RequestMapping(value="/allActivePersonnel",method = RequestMethod.GET)    
    public String allActivePersonnel(Model m){    
		List<ABCSystemDataDto> dtos = homeService.getAllActivatePersonnel();
		m.addAttribute("dtos",dtos);
        return "allActivePersonnel";    
    }
	
	@RequestMapping(value="/activePersonnel",method = RequestMethod.GET)    
    public @ResponseBody List<ABCSystemDataDto> activePersonnel(){  
		System.out.println("activePersonnel.........");
        List<ABCSystemDataDto> res = homeService.getAllActivatePersonnel();
        System.out.println("activePersonnel........."+res);
        return res;
    }
	
	
}
