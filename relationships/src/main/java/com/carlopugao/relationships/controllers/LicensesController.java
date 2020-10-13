package com.carlopugao.relationships.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.carlopugao.relationships.models.License;
import com.carlopugao.relationships.models.Person;
import com.carlopugao.relationships.services.LicenseService;
import com.carlopugao.relationships.services.PersonService;

@Controller
public class LicensesController {
	private final LicenseService licenseService;
	
	public LicensesController(LicenseService licenseService) {
		this.licenseService = licenseService;
	}
	
	@Autowired
	private PersonService personService;
	
	@RequestMapping("/licenses/new")
		public String newLicense(@ModelAttribute("license") License license, Model model) {
		List<Person> persons = personService.allPerson();
		model.addAttribute("persons", persons);
		ArrayList<String> states = new ArrayList<String>(Arrays.asList("Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut",
				"Delaware", "Florida", "Georgia", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas",
				"Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota",
				"Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey",
				"New Mexico", "New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon",
				"Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas",
				"Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"));
		model.addAttribute("states", states); 
		return "driverslicense/newlicense.jsp";
	}
	
	@RequestMapping(value="/license", method=RequestMethod.POST)
	public String addlicense(@Valid @ModelAttribute("license") License license, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println(result.getAllErrors());
			return "redirect:/licenses/new";
		}
		else {
			String number = licenseService.generateLicenseNumber(license);
			license.setNumber(number);
			licenseService.addLicense(license);
			return "redirect:/persons/"+license.getId();
		}
	}
	
}
