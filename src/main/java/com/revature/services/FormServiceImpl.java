package com.revature.services;

import java.util.List;

import com.revature.dao.FormDAOImpl;
import com.revature.pojos.Form;

public class FormServiceImpl implements FormService {

	private static FormDAOImpl fdi = new FormDAOImpl();
	@Override
	public void createNewForm(Form form) {
		
		fdi.createNewForm(form);
		
	}
	@Override
	public List<Form> viewAllForms() {
		// TODO Auto-generated method stub
		List<Form> formlist = null;
		
		  formlist = fdi.getAllForms();
		
		return formlist;
	}
}


