package com.rakesh.ecart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rakesh.ecart.model.Category;
import com.rakesh.ecart.service.CategoryService;

@RestController
public class CategoryController {

	
	@Autowired
	private CategoryService catService;
	
	@PostMapping("add-category")
	public Category addCategory(@RequestBody Category category) {
		 return catService.addCategory(category);
	}
}
