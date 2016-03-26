package org.technovillage.service;

import org.springframework.stereotype.Component;
import org.technovillage.model.Emp;

@Component
public class EmpService {
    
	
	
	public Emp findOne(){
		Emp e=new Emp(10,"Deepak");
		return e;
	}
}
