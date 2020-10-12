package com.carlopugao.relationships.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.carlopugao.relationships.models.Person;
import com.carlopugao.relationships.services.LicenseService;
import com.carlopugao.relationships.services.PersonService;

@Controller
public class PersonsController {
	private final PersonService personService;
	private final LicenseService licenseService;
	
	public PersonsController(PersonService personService, LicenseService licenseService) {
		this.personService = personService;
		this.licenseService = licenseService;
	}
	
	@RequestMapping("/persons/new")
	public String newPerson(@ModelAttribute("person") Person person, Model model) {
		return "/driverslicense/newperson.jsp";
	}
	
	@RequestMapping(value="/person", method=RequestMethod.POST)
	public String addperson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if (result.hasErrors()) {
			return "driverslicense/newperson.jsp";
		}
		else {
			personService.addPerson(person);
			return "redirect:licenses/new";
		}
	}
	
	@RequestMapping("/persons/{id}")
	public String view(@PathVariable("id") Long id, Model model) {
		model.addAttribute("license", licenseService.getLicense(id).get());
		return "driverslicense/viewlicense.jsp";
	}
}
