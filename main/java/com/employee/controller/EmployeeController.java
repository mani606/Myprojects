package com.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	public String getName(@PathVariable String name, ModelMap model) {

		model.addAttribute("name", name);
		return "list";

	}
	@RequestMapping(value="/{name}", method = RequestMethod.GET)
	public String getname(@PathVariable String name, ModelMap model) {

		model.addAttribute("name", name);
		return "list";

	}
	
}
