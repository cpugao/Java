package com.carlopugao.dojooverflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.carlopugao.dojooverflow.models.Tag;
import com.carlopugao.dojooverflow.repositories.TagRepository;

@Service
public class TagService {

	private final TagRepository tagRepository;
	
	public TagService(TagRepository tagRepository) {
		this.tagRepository = tagRepository;
	}
	
	public List<Tag> allTags() {
		return tagRepository.findAll();
	}
	
	public Tag createTag(Tag t) {
		return tagRepository.save(t);
	}
	
	public Tag findTag(Long id) {
		Optional<Tag> tag = tagRepository.findById(id);
		if (tag.isPresent()) {
			return tag.get();
		}
		else {
			return null;
		}
	}
	
	public Tag updateTag(Tag t) {
		return tagRepository.save(t);
	}
	
	public void deleteTag(Long id) {
		tagRepository.deleteById(id);
	}
	
	public Tag findbySubject(String subject) {
		Optional<Tag> tag = tagRepository.findBySubject(subject);
		if (tag.isPresent()) {
			return tag.get();
		}
		else {
			return null;
		}
	}
	
}
