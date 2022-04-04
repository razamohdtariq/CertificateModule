package com.cg.placement.service;

import com.cg.placement.entities.Certificate;
import com.cg.placement.repository.CertificateRepositoryImpl;
import com.cg.placement.repository.ICertificateRepository;

public class CertificateServiceImpl implements ICertificateService 
{
//Step 1: Establishing connection b/w Service and Repository files 
	private ICertificateRepository dao;
	
	
	public CertificateServiceImpl() {
	
		dao = new CertificateRepositoryImpl();
		
	}
//step 2: service calls to perform CRUD Operations
	@Override
	public Certificate addCertificate(Certificate certificate) {
		
		dao.beginTransaction();
		dao.addCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate searchCertificateById(int id) {
		Certificate certificate = dao.searchCertificateById(id);
		return certificate;
	}

	@Override
	public boolean deleteCertificate(int id) {
		dao.beginTransaction();
		dao.deleteCertificate(id);
		dao.commitTransaction();
		return false;
	}

}
