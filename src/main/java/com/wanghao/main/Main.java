package com.wanghao.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

import org.apache.log4j.Logger;

import com.wanghao.dao.impl.EnrollDaoImpl;
import com.wanghao.domain.Enroll;

public class Main {
    public void testAdd() throws SQLException {
	EnrollDaoImpl enrollDaoImpl=new EnrollDaoImpl();
	Enroll enroll=new Enroll(1, new Date().getTime(), new Date().getTime(), "王昊", "5555", "2017年1月9日", "java46班","www.baidu.com", "我最帅", "刘德华");
	enrollDaoImpl.add(enroll);
	Logger logger = Logger.getLogger(Main.class);  
	logger.info("添加完成");
	
    }
    public void testConnection() throws SQLException {
	try {
	    Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	for (int i = 0; i < 1000; i++) {
	    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/it_xzy","root","1234");
	    
	}
    }
    public static void main(String[] args) throws SQLException {
	//Main main=new Main();
	//main.testAdd();
	//main.testConnection();
	EnrollDaoImpl enrollDaoImpl=new EnrollDaoImpl();
	Enroll enroll=new Enroll(1, new Date().getTime(), new Date().getTime(), "王昊", "5555", "2017年1月9日", "java46班","www.baidu.com", "我最帅", "刘德华");
	for(int i=0;i<1000000;i++) {   
	    enrollDaoImpl.add(enroll);    
	    System.out.println(i);
	}
	
    }
}
