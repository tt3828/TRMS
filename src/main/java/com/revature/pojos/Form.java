package com.revature.pojos;

import java.io.Serializable;

public class Form implements Serializable {
	int employee_id;
	int form_id;
	String firstName;
	String lastName;
	String eventDesc;
	String address;
	String city;
	String state;
	String zip;
	String cost;
	String time;
	String date;
	String gradingformat;
	int status;
	String grade;
	
	
	
	
	//creating form
	public Form(int employee_id, String eventDesc, String address, String city, String state, String zip, String cost,
			String time, String date, String gradingformat, String grade) {
		super();
		this.employee_id = employee_id;
		this.eventDesc = eventDesc;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.cost = cost;
		this.time = time;
		this.date = date;
		this.gradingformat = gradingformat;
		this.grade = grade;
	}
	
	
	
	
	public Form(int employee_id, int form_id, String firstName, String lastName, String eventDesc, String address,
			String city, String state, String zip, String cost, String time, String date, String gradingformat,
			int status, String grade) {
		super();
		this.employee_id = employee_id;
		this.form_id = form_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eventDesc = eventDesc;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.cost = cost;
		this.time = time;
		this.date = date;
		this.gradingformat = gradingformat;
		this.status = status;
		this.grade = grade;
	}




	//displaying form to direct supervisor and or anyone above them
	public Form(int employee_id, String firstName, String lastName, String eventDesc, String address, String city,
			String state, String zip, String cost, String time, String date, String gradingformat, String grade) {
		super();
		this.employee_id = employee_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eventDesc = eventDesc;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.cost = cost;
		this.time = time;
		this.date = date;
		this.gradingformat = gradingformat;
		this.grade = grade;
	}
	
	//displaying form to person who submitted
	public Form(int employee_id, String firstName, String lastName, String eventDesc, String address, String city,
			String state, String zip, String cost, String time, String date, String gradingformat, int status,
			String grade) {
		super();
		this.employee_id = employee_id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eventDesc = eventDesc;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.cost = cost;
		this.time = time;
		this.date = date;
		this.gradingformat = gradingformat;
		this.status = status;
		this.grade = grade;
	}
	
	
	public int getForm_id() {
		return form_id;
	}

	public void setForm_id(int form_id) {
		this.form_id = form_id;
	}

	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getfirstname() {
		return firstName;
	}
	
	public void setfirstname(String firstname) {
		this.firstName = firstname;
	}
	
	public String getlastname() {
		return lastName;
	}
	
	public void setlastname(String lastname) {
		this.lastName = lastname;
	}
	
	public String getEventDesc() {
		return eventDesc;
	}
	public void setEventDesc(String eventDesc) {
		this.eventDesc = eventDesc;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getGradingformat() {
		return gradingformat;
	}
	public void setGradingformat(String gradingformat) {
		this.gradingformat = gradingformat;
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	public Form() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Form [employee_id=" + employee_id + ", form_id=" + form_id + ", firstName=" + firstName + ", lastName="
				+ lastName + ", eventDesc=" + eventDesc + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", zip=" + zip + ", cost=" + cost + ", time=" + time + ", date=" + date + ", gradingformat="
				+ gradingformat + ", status=" + status + ", grade=" + grade + "]";
	}
	
	
	}
