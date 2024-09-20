package com.rakesh.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakesh.ecart.model.Category;
import com.rakesh.ecart.repository.CategoryRepository;

@Service
public class CategoryService {

	
	@Autowired
	private CategoryRepository categoryRepo;
	
	

	
	public Category addCategory(Category category) {
		try {
		    return categoryRepo.save(category);
		} catch (Exception e) {
            System.out.println("Exception Occured in addCategory :" +e.getMessage()+"cause:"+e.getCause());
		}
		return null;
	}
}
