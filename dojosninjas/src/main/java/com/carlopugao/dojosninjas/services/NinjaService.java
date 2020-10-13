package com.carlopugao.dojosninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlopugao.dojosninjas.models.Ninja;
import com.carlopugao.dojosninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	private final NinjaRepository ninjaRepository;
	
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	
	public List<Ninja> allNinjas(){
		return ninjaRepository.findAll();
	}
	
	public Ninja createNinja(Ninja n) {
		return ninjaRepository.save(n);
	}
	
	public Ninja findNinja(Long id) {
		Optional<Ninja> ninja = ninjaRepository.findById(id);
		
		if (ninja.isPresent()) {
			return ninja.get();
		} else {
			return null;
		}
	}
}
