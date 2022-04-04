package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.Certificate;

public class CertificateRepositoryImpl implements ICertificateRepository 
{
	//Step 1: start JPA LifeCycle
   private EntityManager entityManager;
   
   
	public CertificateRepositoryImpl() {
		
		entityManager =JPAUtil.getEntityManager();
}
//create operation: repository/DAO
	@Override
	public Certificate addCertificate(Certificate certificate) {
		// TODO Auto-generated method stub
		entityManager.persist(certificate);
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		entityManager.merge(certificate);
		return certificate;
	}

	@Override
	public Certificate searchCertificateById(int id) {
		Certificate  certificate = entityManager.find(Certificate.class, id);
		return certificate;
	}

	@Override
	public boolean deleteCertificate(int id) {
		Certificate  certificate = entityManager.find(Certificate.class, id);
		entityManager.remove(certificate);
		return false;
	}
	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	} 
}
