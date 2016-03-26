package org.technovillage.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.technovillage.domain.Emp;

@RestController
public class EmpController {
    
	@RequestMapping("/emp")
	public Emp getEmp(){
		Emp e=new Emp(13, "ABCD");
		return e;
	}
}
