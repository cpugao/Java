package com.carlopugao.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.carlopugao.relationships.models.License;
import com.carlopugao.relationships.repositories.LicenseRepository;

@Service
public class LicenseService {
	private final LicenseRepository licenseRepository;
	
	public LicenseService(LicenseRepository licenseRepository) {
		this.licenseRepository = licenseRepository;
	}
	
	public License addLicense(License license) {
		return licenseRepository.save(license);
	}
	
	public Optional<License> getLicense(Long id) {
		return licenseRepository.findById(id);
	}
	
	public static int licenseNumber;
	
	public static int getLicenseNumber() {
		return licenseNumber;
	}

	public static void setLicenseNumber(int licenseNumber) {
		LicenseService.licenseNumber = licenseNumber;
	}

	public String stringLicenseNumber(int num) {
		String format = String.format("%o6d", num);
		return format;
	}
	
	public String generateLicenseNumber(License l) {
        Long personId = l.getPerson().getId();
        int idLength = String.valueOf(personId).length();
        int numOfZeros = 6 - idLength;
        String licenseNumber = "";
        
        for (int i = 0; i < numOfZeros; i++) {
            licenseNumber += "0";
        }
        licenseNumber += String.valueOf(personId);
        return licenseNumber;
	}
}
