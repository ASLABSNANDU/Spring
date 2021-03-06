package com.spring.test.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.test.models.Emp;

public class EmpDao {
	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(Emp p) {
		String sql = "insert into emp99(name,salary,designation) values('" + p.getName() + "'," + p.getSalary() + ",'" + p.getDesignation() + "')";
		return template.update(sql);
	}

	public int update(Emp p) {
		String sql = "update emp99 set name='" + p.getName() + "', salary=" + p.getSalary() + ",designation='" + p.getDesignation() + "' where empid=" + p.getEmpid() + "";
		return template.update(sql);
	}

	public int delete(int id) {
		String sql = "delete from emp99 where empid=" + id + "";
		return template.update(sql);
	}

	public Emp getEmpById(int id) {
		String sql = "select * from emp99 where empid=?";
		return template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<Emp>(Emp.class));
	}

	public List<Emp> getEmployees() {
		return template.query("select * from emp99", new RowMapper<Emp>() {
			public Emp mapRow(ResultSet rs, int row) throws SQLException {
				Emp e = new Emp();
				e.setEmpid(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				e.setDesignation(rs.getString(4));
				return e;
			}
		});
	}

	public List<Emp> getEmployeesByPage(int pageid, int total) {
		String sql = "select * from emp99 limit " + (pageid - 1) + "," + total;
		return template.query(sql, new RowMapper<Emp>() {
			public Emp mapRow(ResultSet rs, int row) throws SQLException {
				Emp e = new Emp();
				e.setEmpid(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				return e;
			}
		});
	}
}