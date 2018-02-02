package com.jwt.ejb.business;

import javax.ejb.Remote;

@Remote
public interface EmployeeRemote {
	public boolean addEmployee(String employee);
}
