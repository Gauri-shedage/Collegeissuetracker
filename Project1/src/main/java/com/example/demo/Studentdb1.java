package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Studentdb1 {
	int Issueid;
	public String Issuename;
	public String IssueDescription;
	public String Department;
	public String Issuestatus;
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getIssueid() {
		return Issueid;
	}
	public void setIssueid(int Issueid) {
		this.Issueid = Issueid;
	}
	public String getIssuename() {
		return Issuename;
	}
	public void setIssuename(String issuename) {
		Issuename = issuename;
	}
	public String getIssueDescription() {
		return IssueDescription;
	}
	public void setIssueDescription(String issueDescription) {
		IssueDescription = issueDescription;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getIssuestatus() {
		return Issuestatus;
	}
	public void setIssuestatus(String issuestatus) {
		Issuestatus = issuestatus;
	}
	
	
}
