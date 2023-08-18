package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.persistence.EmployeeDao;
import com.persistence.EmployeeDaoImpl;
import com.presentation.EmployeePresentation;
import com.presentation.EmployeePresentationImpl;
import com.service.EmployeeService;
import com.service.EmployeeServiceImpl;

@Configuration
public class EmployeeConfiguration {
	
	@Bean("empDao")
	public EmployeeDao getEmployeeDao(){
		return new EmployeeDaoImpl();
	}
	
	@Bean("empService")
	public EmployeeService getEmployeeService() {
		return new EmployeeServiceImpl(getEmployeeDao());
	}
	
	@Bean("empPresentation")
	public EmployeePresentation getEmployeePresentation() {
		return new EmployeePresentationImpl(getEmployeeService());
	}

}
