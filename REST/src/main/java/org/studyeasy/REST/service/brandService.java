package org.studyeasy.REST.service;

import java.util.List;

import org.studyeasy.REST.DAO.BrandDAO;
import org.studyeasy.REST.model.brandModel;


public class brandService {

	BrandDAO dao=new BrandDAO();
	public List<brandModel> getListUser() {
		
		return dao.getListUser();
	}

	
}
