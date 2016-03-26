package org.technovillage.service;

import org.springframework.stereotype.Component;
import org.technovillage.model.Emp;

@Component
public class EmpService {

	public Emp find(int id){
		Emp e=null;
		if(id==10) e=new Emp(10,"Deepak");
		else if (id ==11) e=new Emp(11,"ABC");
		else e = new Emp(12,"XYZ");
		return e;
	}
}
