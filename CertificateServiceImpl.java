package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Certificate;
import com.example.demo.repository.CertificateRepository;

@Service
public class CertificateServiceImpl implements CertificateService {
	
	
	@Autowired
	private CertificateRepository repository;

	public Certificate saveCertificate(Certificate certificate) {
		return repository.save(certificate);
	}

	public List<Certificate> getCertificateList() {
		return repository.findAll();
	}

	public Certificate getCertificateById(Long id) {
		return repository.findById(id).get();
	}

	public void deleteCertificateById(Long id) {
		repository.deleteById(id);
		
	}

}
