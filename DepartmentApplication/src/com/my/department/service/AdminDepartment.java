package com.my.department.service;

public class AdminDepartment extends SuperDepartment{
	
	@Override
	public String departName() {
		return "Admin Department. ";
	}
	@Override
	public String getTodaysWork() {
		return "Complete your documents Submission ";
	}
	@Override
	public String getWorkDeadline() {
		return "Complete by EOD.";
	}

}
