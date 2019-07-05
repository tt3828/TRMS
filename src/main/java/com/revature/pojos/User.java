package com.revature.pojos;

public class User {
	
	
	private int employee_id;
	private int role_id;
	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private String emailaddress;
	private int reiumbursement_amount;
	
	
	
	
	public User(int employee_id, int role_id, String username, String password, String firstname, String lastname,
			String emailaddress, int reiumbursement_amount) {
		super();
		this.employee_id = employee_id;
		this.role_id = role_id;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailaddress = emailaddress;
		this.reiumbursement_amount = reiumbursement_amount;
	}
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmailaddress() {
		return emailaddress;
	}
	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}
	public int getReiumbursement_amount() {
		return reiumbursement_amount;
	}
	public void setReiumbursement_amount(int reiumbursement_amount) {
		this.reiumbursement_amount = reiumbursement_amount;
	}
	@Override
	public String toString() {
		return "User [employee_id=" + employee_id + ", role_id=" + role_id + ", username=" + username + ", password="
				+ password + ", firstname=" + firstname + ", lastname=" + lastname + ", emailaddress=" + emailaddress
				+ ", reiumbursement_amount=" + reiumbursement_amount + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emailaddress == null) ? 0 : emailaddress.hashCode());
		result = prime * result + employee_id;
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + reiumbursement_amount;
		result = prime * result + role_id;
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (emailaddress == null) {
			if (other.emailaddress != null)
				return false;
		} else if (!emailaddress.equals(other.emailaddress))
			return false;
		if (employee_id != other.employee_id)
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (reiumbursement_amount != other.reiumbursement_amount)
			return false;
		if (role_id != other.role_id)
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	
	

}
