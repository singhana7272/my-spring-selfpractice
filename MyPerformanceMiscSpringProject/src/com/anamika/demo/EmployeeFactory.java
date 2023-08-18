package com.anamika.demo;

public class EmployeeFactory {
	
	Employee getSalariedEmployee() {
		return new SalariedEmployee();
	}
	
	Employee getWagedEmployee() {
		return new WagedEmployee();
	}

}
