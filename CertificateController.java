package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Certificate;
import com.example.demo.service.CertificateServiceImpl;

@RestController
public class CertificateController {
	
	@Autowired
	private CertificateServiceImpl service;
	
	@PostMapping("/certificate")
	public Certificate saveCertificate(@RequestBody Certificate certificate) {
		return service.saveCertificate(certificate);
	}
	
	@GetMapping("certificate")
	public List<Certificate> getCertificateList() {
		return service.getCertificateList();
	}
	
	@GetMapping("/certificate/{id}")
	public Certificate getCertificateById(@PathVariable("id") Long id) {
		return service.getCertificateById(id);
	}
	
	@DeleteMapping("/certificate/{id}")
	public String deleteCertificateById(@PathVariable("id") Long id) {
		service.deleteCertificateById(id);
		return "Certificate removed / deleted Successfully!";
	}
	

}
