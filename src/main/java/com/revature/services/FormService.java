package com.revature.services;

import java.util.List;

import com.revature.dao.FormDAO;
import com.revature.pojos.Form;

public interface FormService {
	
	public List<Form> viewAllForms();
	
	public void createNewForm(Form form);
}


