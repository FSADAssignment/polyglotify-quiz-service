package org.bits.fsad.quiz.controller;

import org.bits.fsad.quiz.enums.Language;
import org.bits.fsad.quiz.factory.LanguageServiceFactory;
import org.bits.fsad.quiz.model.Question;
import org.bits.fsad.quiz.service.IQuestionService;
import org.bits.fsad.quiz.util.CollectionNameHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class QuestionsController {

    @Autowired
    LanguageServiceFactory languageServiceFactory;

    @GetMapping("/questions/{language}")
    public List<Question> getQuestion(@PathVariable Language language, @RequestParam String subcategory, @RequestParam String level) {
        try {
            CollectionNameHolder.set(language.toString().toLowerCase());
            IQuestionService questionService = languageServiceFactory.createService(language.toString());

            return questionService.getAllQuestions(subcategory, level);
        } finally {
            CollectionNameHolder.reset();
        }

    }
}
