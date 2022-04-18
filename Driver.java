package com.greatlearning.driver;

import com.greatlearning.model.adminDepartment;
import com.greatlearning.model.hrDepartment;
import com.greatlearning.model.superDepartment;
import com.greatlearning.model.techDepartment;

public class Driver {
 
	public static void main(String args[]) {
		superDepartment ss= new adminDepartment();
		adminDepartment adm= new adminDepartment();
		hrDepartment hr= new hrDepartment();
		techDepartment tech= new techDepartment();
		
		System.out.println("Welcome to"+" "+adm.departmentName());
		System.out.println(adm.getTodaysWork());
	    System.out.println(adm.getWorkDeadline());
	    System.out.println(ss.isTodayAHoliday());
	    System.out.println(" ");
	    
	    System.out.println("Welcome to"+" "+hr.departmentName());
		System.out.println(hr.doActivity());
	    System.out.println(hr.getTodaysWork());
	    System.out.println(hr.getWorkDeadline());
	    System.out.println(ss.isTodayAHoliday());
	    System.out.println(" ");
	    
	    System.out.println("Welcome to"+" "+tech.departmentName());
		System.out.println(tech.getTodaysWork());
	    System.out.println(tech.getWorkDeadline());
	    System.out.println(tech.getTechStackInformation());
	    System.out.println(ss.isTodayAHoliday());
		
		
	}
	
	
}
