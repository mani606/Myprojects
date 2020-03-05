package com.employee.entity;

import java.util.Date;

//@Entity
//@Table(name="employee_time")
public class Employee_Time {
	
	private int empid;
	private Date timein;
	private Date timeout;
	private Date empdate;
	
	public Date getEmpdate() {
		return empdate;
	}
	public void setEmpdate(Date empdate) {
		this.empdate = empdate;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public Date getTimein() {
		return timein;
	}
	public void setTimein(Date timein) {
		this.timein = timein;
	}
	public Date getTimeout() {
		return timeout;
	}
	public void setTimeout(Date timeout) {
		this.timeout = timeout;
	}
	
	

}
