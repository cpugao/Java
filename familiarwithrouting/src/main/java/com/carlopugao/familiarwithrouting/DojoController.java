package com.carlopugao.familiarwithrouting;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	@RequestMapping("{name}")
	public String dojo(@PathVariable("name") String name) {
		if (name.equals("dojo")) {
			return "The dojo is awesome!";
		}
		if (name.equals("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California.";
		}	
		if (name.equals("san-jose")) {
			return "SJ dojo is the headquarters.";
		}
		return "";
	}
}
