package com.pojo;
// Generated Jul 10, 2019 5:01:50 PM by Hibernate Tools 3.5.0.Final

/**
 * Supplier generated by hbm2java
 */
public class Supplier implements java.io.Serializable {

	private Integer supid;
	private String sname;
	private String smobile;
	private String semail;
	private String saddress;

	public Supplier() {
	}

	public Supplier(String sname, String smobile, String semail, String saddress) {
		this.sname = sname;
		this.smobile = smobile;
		this.semail = semail;
		this.saddress = saddress;
	}

	public Integer getSupid() {
		return this.supid;
	}

	public void setSupid(Integer supid) {
		this.supid = supid;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSmobile() {
		return this.smobile;
	}

	public void setSmobile(String smobile) {
		this.smobile = smobile;
	}

	public String getSemail() {
		return this.semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public String getSaddress() {
		return this.saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

}