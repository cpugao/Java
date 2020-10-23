package com.carlopugao.dojooverflow.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.carlopugao.dojooverflow.models.Answer;
import com.carlopugao.dojooverflow.models.Question;
import com.carlopugao.dojooverflow.models.Tag;
import com.carlopugao.dojooverflow.services.AnswerService;
import com.carlopugao.dojooverflow.services.QuestionService;
import com.carlopugao.dojooverflow.services.TagService;

@Controller
public class MainController {
	
	private final QuestionService questionService;
	private final AnswerService answerService;
	private final TagService tagService;
	
	public MainController (QuestionService questionService, AnswerService answerService, TagService tagService) {
		this.questionService = questionService;
		this.answerService = answerService;
		this.tagService = tagService;
	}
	
	@RequestMapping("/questions")
	public String questions(Model model) {
		model.addAttribute("questions", questionService.allQuestions());
		return "dashboard.jsp";
	}
	
	@RequestMapping("/questions/new")
	public String newQuestion(Model model) {
		model.addAttribute("question", new Question());
		return "newquestion.jsp";
	}
	
	@PostMapping("/questions/new")
	public String createQuestion(@RequestParam("question") String question, @RequestParam("tags") String tags, RedirectAttributes redirectAttributes) {
		if (question.isEmpty()) {
			redirectAttributes.addFlashAttribute("error", "Question must be present");
			return "redirect:/questions/new";
		}
		Question q = new Question(question);
		if (!tags.isEmpty()) {
			String[] allTags = tags.split(",");
			if (allTags.length>3) {
				redirectAttributes.addFlashAttribute("error", "No more than 3 tags");
				return "redirect:/questions/new";
			}
			for (String tag:allTags) {
				Tag t = tagService.findbySubject(tag);
				if (t != null) {
					q.addTag(t);
				}
				else {
					Tag newTag = new Tag(tag.trim());
					tagService.createTag(newTag);
					q.addTag(newTag);
				}
			}
		}
		questionService.createQuestion(q);
		return "redirect:/questions";
	}
	
	@RequestMapping("/questions/{id}")
	public String showQuestion(@PathVariable("id") Long id, Model model, @ModelAttribute("answer") Answer answer) {
		model.addAttribute("question", questionService.findQuestion(id));
		return "answer.jsp";
	}
	
	@PostMapping("/answers/{id}/new")
	public String createAnswer(@PathVariable Long id, @Valid @ModelAttribute("answer") Answer answer, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("question", questionService.findQuestion(id)) ;
			return "answer.jsp";
		}
		else {
			Question q = questionService.findQuestion(id);
			answer.setQuestion(q);
			answerService.createAnswer(answer);
			return "redirect:/questions/{id}";
		}
	}
	
}
