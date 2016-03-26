package org.technovillage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.technovillage.model.Emp;
import org.technovillage.service.EmpService;

@Controller
public class EmpController {
	
	@Autowired
	EmpService empService;

	@RequestMapping("/employee")
	public String retrieveEmployee(Model map){
		System.out.println("retrieveEmployee");
		Emp e=empService.findOne();
		map.addAttribute("employee", e);
		return "displayMyView";
		
	}
}
