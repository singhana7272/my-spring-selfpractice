package com.anamika.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.anamika.producer.Connection;
import com.anamika.producer.EmployeeDao;

public class MyDBConnectionMain {

	public static void main(String[] args) {
		
		ApplicationContext springContainer=new ClassPathXmlApplicationContext("connect.xml");
//		Connection connection1=(Connection)springContainer.getBean("OracleConnection");
//	    connection1.connect();
//	    
//	    
//	    Connection connection2=(Connection)springContainer.getBean("MySqlConnection");
//	    connection2.connect();
		
		EmployeeDao dao=(EmployeeDao)springContainer.getBean("empDao");
		dao.getConnected();
	
	}

}
