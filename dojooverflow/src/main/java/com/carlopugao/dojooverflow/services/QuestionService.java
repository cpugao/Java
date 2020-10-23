package com.carlopugao.dojooverflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.carlopugao.dojooverflow.models.Question;
import com.carlopugao.dojooverflow.repositories.QuestionRepository;

@Service
public class QuestionService {

	private final QuestionRepository questionRepository;
	
	public QuestionService(QuestionRepository questionRepository) {
		this.questionRepository = questionRepository;
	}
	
	public List<Question> allQuestions() {
		return questionRepository.findAll();
	}
	
	public Question createQuestion(Question q) {
		return questionRepository.save(q);
	}
	
	public Question findQuestion(Long id) {
		Optional<Question> question = questionRepository.findById(id);
		if (question.isPresent()) {
			return question.get();
		}
		else {
			return null;
		}
	}
	
	public Question updateQuestion(Question q) {
		return questionRepository.save(q);
	}
	
	public void deleteQuestion(Long id) {
		questionRepository.deleteById(id);
	}
}
