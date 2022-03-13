package com.my.department.controller;

import com.my.department.service.AdminDepartment;
import com.my.department.service.HrDepartment;
import com.my.department.service.TechDepartment;

public class Main {
	public static void main(String[] args) {
		HrDepartment hrDeptaDepartment =  new HrDepartment();
		TechDepartment techDepartment = new TechDepartment();
		AdminDepartment adminDepartment = new AdminDepartment();
		
		// Admin Department
		System.out.println("\nWelcome "+adminDepartment.departName()
							+"\n"+adminDepartment.getTodaysWork()
							+"\n"+adminDepartment.getWorkDeadline()
							+"\n"+adminDepartment.isTodayHoliday());
		
		// HR Department
		System.out.println("\nWelcome "+hrDeptaDepartment.departName()
							+"\n"+hrDeptaDepartment.doActivity()
							+"\n"+hrDeptaDepartment.getTodaysWork()
							+"\n"+hrDeptaDepartment.getWorkDeadline()
							+"\n"+hrDeptaDepartment.isTodayHoliday());
		
		// Tech Department
		System.out.println("\nWelcome "+techDepartment.departName()
							+"\n"+techDepartment.getTodaysWork()
							+"\n"+techDepartment.getWorkDeadline()
							+"\n"+techDepartment.getTechStackInformation()
							+"\n"+techDepartment.isTodayHoliday());
	}
}
