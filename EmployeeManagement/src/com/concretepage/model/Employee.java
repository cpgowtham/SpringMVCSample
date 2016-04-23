package com.concretepage.model;

public class Employee {
	
 private String name;
 private int age;
 private int empid;
 private String email;
 private String pwd;
 
 public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
