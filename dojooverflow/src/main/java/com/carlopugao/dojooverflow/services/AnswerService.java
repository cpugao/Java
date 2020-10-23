package com.carlopugao.dojooverflow.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.carlopugao.dojooverflow.models.Answer;
import com.carlopugao.dojooverflow.repositories.AnswerRepository;

@Service
public class AnswerService {

	private final AnswerRepository answerRepository;
	
	public AnswerService(AnswerRepository answerRepository) {
		this.answerRepository = answerRepository;
	}
	
	public List<Answer> allAnswers() {
		return answerRepository.findAll();
	}
	
	public Answer createAnswer(Answer a) {
		return answerRepository.save(a);
	}
	
	public Answer findAnswer(Long id) {
		Optional<Answer> answer = answerRepository.findById(id);
		if (answer.isPresent()) {
			return answer.get();
		}
		else {
			return null;
		}
	}
	
	public Answer updateAnswer(Answer a) {
		return answerRepository.save(a);
	}
	
	public void deleteAnswer(Long id) {
		answerRepository.deleteById(id);
	}
}
