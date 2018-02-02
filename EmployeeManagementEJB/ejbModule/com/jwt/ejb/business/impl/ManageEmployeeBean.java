package com.jwt.ejb.business.impl;

import com.jwt.ejb.business.EmployeeRemote;
import javax.ejb.Stateless;

@Stateless
public class ManageEmployeeBean implements EmployeeRemote {

    public ManageEmployeeBean() {
    	
    }
    
    public boolean addEmployee(String employee) {
        System.out.println("ejb calling: " + employee);
        return true;
    }

}
