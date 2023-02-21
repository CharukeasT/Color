package com.example.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class Sample {
	@RequestMapping("/color")
	public String color(HttpServletRequest req) {
		String color = req.getParameter("color");
		HttpSession session = req.getSession();
		session.setAttribute("displaycolor",color);
		return "NewFile.jsp";
	}
}
