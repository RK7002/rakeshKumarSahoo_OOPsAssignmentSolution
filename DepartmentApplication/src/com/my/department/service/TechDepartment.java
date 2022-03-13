package com.my.department.service;

public class TechDepartment extends SuperDepartment{
	
	@Override
	public String departName() {
		return "Admin Department. ";
	}
	@Override
	public String getTodaysWork() {
		return "Complete coding of module 1.";
	}
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD.";
	}

	public String getTechStackInformation() {
		return "core Java";
	}

}
