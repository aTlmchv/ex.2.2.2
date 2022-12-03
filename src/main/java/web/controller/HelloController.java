package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> message = new ArrayList<>();
		message.add("Hello!");
		message.add("I'm Spring MVC application");
		message.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", message);
		return "index";
	}
}