package org.technovillage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.technovillage.model.Emp;
import org.technovillage.service.EmpService;

@RestController
public class EmpController {
	
	@Autowired
	EmpService empService;

	@RequestMapping("/employee")
	public Emp retrieveEmployee(){
		System.out.println("retrieveEmployee");
		Emp e=empService.findOne();
		//map.addAttribute("employee", e);
		return e;
		
	}
}
