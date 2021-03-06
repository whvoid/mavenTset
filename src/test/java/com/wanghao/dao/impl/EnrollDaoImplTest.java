package com.wanghao.dao.impl;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import com.wanghao.domain.Enroll;
public class EnrollDaoImplTest {
    EnrollDaoImpl enrollDaoImpl=new EnrollDaoImpl();
    Logger logger = Logger.getLogger(this.getClass());  
    
    @Test
    public void testAdd() throws SQLException {
	Enroll enroll=new Enroll(1, new Date().getTime(), new Date().getTime(), "王昊", "5555", "2017年1月9日", "java46班","www.baidu.com", "我最帅", "刘德华");
	enrollDaoImpl.add(enroll);
	logger.info("添加测试完成");
    }

    @Test
    public void testUpdate() throws SQLException {
	Enroll enroll=new Enroll(1, new Date().getTime(), new Date().getTime(), "王昊", "6666", "2017年1月9日", "java46班","www.baidu.com", "我最帅", "刘德华");
	enrollDaoImpl.update(enroll);
    }

    @Test
    public void testDelete() throws SQLException {
	enrollDaoImpl.delete(2);
    }

    @Test
    public void testFindById() throws SQLException {
	System.out.println(enrollDaoImpl.findById(1).getStudentName());
	
    }

    @Test
    public void testFindAll() throws SQLException {
	List<Enroll> enrolls=enrollDaoImpl.findAll();
	System.out.println(enrolls.size());
    }

}
