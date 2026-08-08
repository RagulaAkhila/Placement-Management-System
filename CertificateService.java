package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Certificate;

public interface CertificateService {
	
	
	Certificate saveCertificate(Certificate certificate);
	
	List<Certificate> getCertificateList();
	
	Certificate getCertificateById(Long id);
	
	void deleteCertificateById(Long id);	


}
