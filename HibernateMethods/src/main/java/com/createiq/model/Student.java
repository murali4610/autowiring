package com.createiq.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@Entity

@Table(name="emp1002")
@NamedQueries(value = { 
		@NamedQuery(name = "emp1002.findAll", query = "from Student"),
  @NamedQuery(name = "emp.findByName", query = "from Student where sname=:saname"),
  @NamedQuery(name = "emp.findByFee", query = "from Student where sfee=:sfee"),
  @NamedQuery(name = "emp.findByNameAndFee", query = "from Student where same=:saname and sfee= :sfee")
})
public class Student {
	@Id
	private int sid;
	private String sname;
	private double sfee;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, double sfee) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sfee = sfee;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public double getSfee() {
		return sfee;
	}

	public void setSfee(double sfee) {
		this.sfee = sfee;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sfee=" + sfee + "]";
	}

}



