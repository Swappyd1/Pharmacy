package com.pojo;
// Generated Jul 10, 2019 5:01:50 PM by Hibernate Tools 3.5.0.Final

/**
 * Contactus generated by hbm2java
 */
public class Contactus implements java.io.Serializable {

	private Integer cid;
	private String fname;
	private String lname;
	private String email;
	private String message;

	public Contactus() {
	}

	public Contactus(String fname, String lname, String email, String message) {
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.message = message;
	}

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
