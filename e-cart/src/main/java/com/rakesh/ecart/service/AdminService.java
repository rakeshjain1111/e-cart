package com.rakesh.ecart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rakesh.ecart.model.Admin;
import com.rakesh.ecart.repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminRepository;
	
	public int loginAdmin(Admin admin) {
		try {
			return adminRepository.getAdminByUnameAndPass(admin.getUsername(), admin.getPassword(), admin.getStatus());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return 0;
	}
}
