package com.wanghao.dao.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.wanghao.dao.EnrollDao;
import com.wanghao.domain.Enroll;
import com.wanghao.until.ConnectionUntil;
public class EnrollDaoImpl implements EnrollDao{
    @Override
    public void add(Enroll enroll) throws SQLException {
	Connection conn = null;
	PreparedStatement ps = null;
	String sql = "insert into enroll(create_at,update_at,student_name,student_qq,join_time,student_number,log_link,target,reference) values(?,?,?,?,?,?,?,?,?)";
	try{
	    conn = ConnectionUntil.getConnection();
	    ps = conn.prepareStatement(sql);
	    ps.setLong(1, enroll.getCreateAt());
	    ps.setLong(2, enroll.getUpdateAt());
	    ps.setString(3, enroll.getStudentName());
	    ps.setString(4, enroll.getStudentQq());
	    ps.setString(5, enroll.getJoinTime());
	    ps.setString(6, enroll.getStudentNumber());
	    ps.setString(7, enroll.getLogLink());
	    ps.setString(8, enroll.getTarget());
	    ps.setString(9, enroll.getReference());
	    ps.executeUpdate();
	}catch(SQLException e){
	    e.printStackTrace();
	throw new SQLException("添加数据失败");
	}finally{
	    ConnectionUntil.close(null, ps, conn);
	}
    }

    @Override
    public void update(Enroll enroll) throws SQLException {
	Connection conn = null;
	PreparedStatement ps = null;
	String sql = "update enroll set create_at=?,update_at=?,student_name=?,student_qq=?,join_time=?,student_number=?,log_link=?,target=?,reference=?";
	try{
	    conn = ConnectionUntil.getConnection();
	    ps = conn.prepareStatement(sql);
	    ps.setLong(1, enroll.getCreateAt());
	    ps.setLong(2, enroll.getUpdateAt());
	    ps.setString(3, enroll.getStudentName());
	    ps.setString(4, enroll.getStudentQq());
	    ps.setString(5, enroll.getJoinTime());
	    ps.setString(6, enroll.getStudentNumber());
	    ps.setString(7, enroll.getLogLink());
	    ps.setString(8, enroll.getTarget());
	    ps.setString(9, enroll.getReference());
	    ps.setLong(10, enroll.getId());
	    ps.executeUpdate();
	}catch(SQLException e){
	e.printStackTrace();
	throw new SQLException("更新数据失败");
	}finally{
	    ConnectionUntil.close(null, ps, conn);
	}     
	
    }
    @Override
    public void delete(long id) throws SQLException {
	Connection conn = null;
	PreparedStatement ps = null;
	String sql = "delete from enroll where id=?";
	try{
	    conn = ConnectionUntil.getConnection();
	    ps = conn.prepareStatement(sql);
	    ps.setLong(1,id);
	    ps.executeUpdate();
	}catch(SQLException e){
	    e.printStackTrace();
	    throw new SQLException(" 删除数据失败");
	}finally{
	    ConnectionUntil.close(null, ps, conn);
	}   
	
    }

    @Override
    public Enroll findById(long id) throws SQLException {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Enroll enroll = null;
	String sql = "select * from enroll where id=?";
	try{
	    conn = ConnectionUntil.getConnection();
	    ps = conn.prepareStatement(sql);
	    ps.setLong(1, id);
	    rs = ps.executeQuery();
	    if(rs.next()){
		enroll = new Enroll();
		enroll.setId(id);
		enroll.setCreateAt(rs.getLong(2));
		enroll.setUpdateAt(rs.getLong(3));
		enroll.setStudentName(rs.getString(4));
		enroll.setStudentQq(rs.getString(5));
		enroll.setJoinTime(rs.getString(6));
		enroll.setStudentNumber(rs.getString(7));
		enroll.setLogLink(rs.getString(8));
		enroll.setTarget(rs.getString(9));
		enroll.setReference(rs.getString(10));
	    }
	}catch(SQLException e){
	    e.printStackTrace();
	    throw new SQLException("根据ID查询数据失败");
	}finally{
	    ConnectionUntil.close(rs, ps, conn);
	}
	return enroll;
    }

    @Override
    public List<Enroll> findAll() throws SQLException {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Enroll enroll = null;
	List<Enroll> enrolls = new ArrayList<Enroll>();
	String sql = "select * from enroll";
	try{
	    conn = ConnectionUntil.getConnection();
	    ps = conn.prepareStatement(sql);
	    rs = ps.executeQuery();
	    while(rs.next()){
		enroll = new Enroll();
		enroll = new Enroll();
		enroll.setId(rs.getLong(1));
		enroll.setCreateAt(rs.getLong(2));
		enroll.setUpdateAt(rs.getLong(3));
		enroll.setStudentName(rs.getString(4));
		enroll.setStudentQq(rs.getString(5));
		enroll.setJoinTime(rs.getString(6));
		enroll.setStudentNumber(rs.getString(7));
		enroll.setLogLink(rs.getString(8));
		enroll.setTarget(rs.getString(9));
		enroll.setReference(rs.getString(10));
		enrolls.add(enroll);
	    }
	}catch(SQLException e){
	    e.printStackTrace();
	    throw new SQLException("查询所有数据失败");
	}finally{
	    ConnectionUntil.close(rs, ps, conn);
	}
	return enrolls;
    }
}
