package com.carlopugao.dojosurvey.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DojoSurveyController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/confirm", method=RequestMethod.POST)
	public String confirm (
			@RequestParam(value="name") String name,
			@RequestParam(value="location") String location,
			@RequestParam(value="language") String language,
			@RequestParam(value="comment") String comment,
			HttpSession session) {
					session.setAttribute("name",  name);
					session.setAttribute("location", location);
					session.setAttribute("language",  language);
					session.setAttribute("comment",  comment);
					return "redirect:/results";			
	}
	
	@RequestMapping("/results")
	public String results () {
		return "results.jsp";
	}
}
