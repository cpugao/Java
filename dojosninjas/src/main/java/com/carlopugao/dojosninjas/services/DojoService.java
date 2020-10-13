package com.carlopugao.dojosninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlopugao.dojosninjas.models.Dojo;
import com.carlopugao.dojosninjas.repositories.DojoRepository;

@Service
public class DojoService {

	private final DojoRepository dojoRepository;
	
	public DojoService(DojoRepository dojoRepository) {
		this.dojoRepository = dojoRepository;
	}
	
	public List<Dojo> allDojos(){
		return dojoRepository.findAll();
	}
	
	public Dojo createDojo(Dojo d) {
		return dojoRepository.save(d);
	}
	
	public Dojo findDojo(Long id) {
		Optional<Dojo> dojo = dojoRepository.findById(id);
		
		if (dojo.isPresent()) {
			return dojo.get();
		} else {
			return null;
		}
	}
}
