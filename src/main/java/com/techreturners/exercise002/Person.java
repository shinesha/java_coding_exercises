package com.techreturners.exercise002;

public class Person {

    
    String fname;
    String lname;
    String city;
    int age;


	public String getFname() {
		return fname;
	}
	public Person(String fname, String lname, String city, int age) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.city = city;
		this.age = age;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}

