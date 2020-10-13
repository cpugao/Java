package com.carlopugao.dojosninjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.carlopugao.dojosninjas.models.Dojo;
import com.carlopugao.dojosninjas.models.Ninja;
import com.carlopugao.dojosninjas.services.DojoService;
import com.carlopugao.dojosninjas.services.NinjaService;

@Controller
public class MainController {
		
	private final DojoService dojoService;
	private final NinjaService ninjaService;
		
	public MainController(DojoService dojoService, NinjaService ninjaService) {
		this.dojoService = dojoService;
		this.ninjaService = ninjaService;
	}
		
	@RequestMapping("/dojos/new")
	public String Dojo(@ModelAttribute("dojo") Dojo dojo) {
		return "dojo.jsp";
	}
	
	@RequestMapping(value="/dojos", method=RequestMethod.POST)
	public String createDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "dojo.jsp";
		} else {
			dojoService.createDojo(dojo);
			return "redirect:/dojos/new";
		}
	}
	
	@RequestMapping("/ninjas/new")
	public String Ninja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "ninja.jsp";
	}
	
	@RequestMapping(value="/ninjas", method=RequestMethod.POST)
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			System.out.println(result.getAllErrors());
			return "ninja.jsp";
		} else {
			ninjaService.createNinja(ninja);
			return "redirect:/ninjas/new";
		}
	}
	
	@RequestMapping("/dojos/{id}")
	public String showDojo(@PathVariable("id") Long id, Model model) {
		Dojo dojo = dojoService.findDojo(id);
		List<Ninja> ninjas = dojo.getNinjas();
		model.addAttribute("dojo", dojo);
		model.addAttribute("ninjas", ninjas);
		return "showdojo.jsp";
	}
}
