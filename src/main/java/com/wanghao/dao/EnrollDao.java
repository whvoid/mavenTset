package com.wanghao.dao;
import java.sql.SQLException;
import java.util.List;

import com.wanghao.domain.Enroll;

public interface EnrollDao {
    //添加方法
    public void add(Enroll enroll)throws SQLException;
    
    //更新方法
    public void update(Enroll enroll)throws SQLException;
    
    //删除方法
    public void delete(long id)throws SQLException;
    
    //查找方法
    public Enroll findById(long id)throws SQLException;
    
    //查找所有
    public List<Enroll> findAll()throws SQLException;
}
