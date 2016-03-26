package org.technovillage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.xml.MarshallingView;
import org.technovillage.model.Emp;

@Configuration
@EnableWebMvc
public class EmpRestConfig {

	@Bean
	public View displayMyView() {
		return new MarshallingView(jaxb2Marshaller());
	}

	@Bean
	public Marshaller jaxb2Marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setClassesToBeBound(Emp.class);
		return marshaller;
	}
	
	@Bean
	public ViewResolver viewResolver(){
		return new BeanNameViewResolver();
	}
}
