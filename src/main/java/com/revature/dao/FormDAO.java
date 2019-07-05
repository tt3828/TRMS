package com.revature.dao;

import java.util.List;

import com.revature.pojos.Form;

public interface FormDAO {
	
	public void createNewForm(Form form);
	
	public List<Form> getAllForms();
	
}
