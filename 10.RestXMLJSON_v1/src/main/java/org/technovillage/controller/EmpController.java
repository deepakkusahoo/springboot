package org.technovillage.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.technovillage.domain.Emp;

@RestController
public class EmpController {
    
	@RequestMapping(value="/emp",produces=MediaType.APPLICATION_JSON_VALUE)
	public Emp getEmpJSON(){
		Emp e=new Emp(13, "ABCD");
		return e;
	}
	
	@RequestMapping(value="/emp",produces=MediaType.APPLICATION_XML_VALUE)
	public Emp getEmpXML(){
		Emp e=new Emp(13, "ABCD");
		return e;
	}
}
