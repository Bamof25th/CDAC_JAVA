package com.customer.core;

import java.time.LocalDate;

import com.customer.utils.Plans;

public class Customer {
	public static int cid;
	private String fname;
	private String lname;
	private String email;
	private String password;
	private double regAmt;
	private LocalDate dob;
	private Plans p;

	public Customer(String fname, String lname, String email, String password, double regAmt, LocalDate dob, Plans p) {
		this.cid = ++cid;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.password = password;
		this.regAmt = regAmt;
		this.dob = dob;
		this.p = p;

	}

	@Override
	public String toString() {
		return "Customer [fname=" + fname + ", lname=" + lname + ", email=" + email + ", dob=" + dob + ", p=" + p + "]";
	}

	public static int getCid() {
		return cid;
	}

	public static void setCid(int cid) {
		Customer.cid = cid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getRegAmt() {
		return regAmt;
	}

	public void setRegAmt(double regAmt) {
		this.regAmt = regAmt;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Plans getP() {
		return p;
	}

	public void setP(Plans p) {
		this.p = p;
	}

	boolean userLogin(String email, String password) {
		if (email != null && password != null) {
			boolean isemail = this.email.equals(email);
			boolean isPassword = this.password.equals(password);
			if(isemail && isPassword )
			return true;
		}
		return false;
	}

}
