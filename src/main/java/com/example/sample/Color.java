package com.example.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Color {
	@GetMapping("/call")
	public String color() {
		String color = "Aquamarine";
		return "My favourite color is " + color;
	}
}
