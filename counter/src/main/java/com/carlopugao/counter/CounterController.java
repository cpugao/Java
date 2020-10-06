package com.carlopugao.counter;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CounterController {
	@RequestMapping("/")
	 public String counter(HttpSession session){
        if (session.getAttribute("counter") == null) {
        	session.setAttribute("counter", 0);
        } else {
        	session.setAttribute("counter",  (Integer) session.getAttribute("counter")+1);
        }
        return "index.jsp";
    }
	
	@RequestMapping("/counter") 
	public String counter() {
		return "counter.jsp";
	}
}
