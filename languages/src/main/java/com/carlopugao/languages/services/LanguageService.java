package com.carlopugao.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.carlopugao.languages.models.Language;
import com.carlopugao.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final  LanguageRepository languageRepository;
	
	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	
	//returns all languages
	public List<Language> allLanguages() {
		return languageRepository.findAll();
	}
	
	//creates language
	public Language createLanguage(Language l) {
		return languageRepository.save(l);
	}
	
	//retrieves language
	public Language findLanguage(Long id) {
		Optional<Language> optionalLanguage = languageRepository.findById(id);
		if (optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		}
		else {
			return null;
		}
	}
	 
	public Language updateLanguage(Long id, String name, String creator, String version) {
		Language l = this.findLanguage(id);
		l.setName(name);
		l.setCreator(creator);
		l.setVersion(version);
		return languageRepository.save(l);
	}
	
	public void deleteLanguage(Long id) {
		languageRepository.deleteById(id);
	}
	
	public Language updateLanguage(Language language) {
		return languageRepository.save(language);
	}
	
}
