package com.cg.placement.client;

import com.cg.placement.entities.Certificate;
import com.cg.placement.service.CertificateServiceImpl;
import com.cg.placement.service.ICertificateService;


public class client {

	public static void main(String[] args)
	{
		//CRUD Operation calling activity
		
		Certificate certificate = new Certificate();
		
		ICertificateService service = new CertificateServiceImpl(); 
		
		//Create
		
	/*certificate = service.searchCertificateById(2110827);
		//certificate.setYear(2021);
		certificate.setCollege("Gautam Buddha University");
		service.addCertificate(certificate);
		*/
		
		//Retrieve
		
		service.searchCertificateById(2110827);
		System.out.println("Id is:" +certificate.getId());
		
	}

}
