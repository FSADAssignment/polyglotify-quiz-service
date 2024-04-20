package org.bits.fsad.quiz.factory;

import org.bits.fsad.quiz.service.EnglishQuestionService;
import org.bits.fsad.quiz.service.FrenchQuestionService;
import org.bits.fsad.quiz.service.IQuestionService;
import org.bits.fsad.quiz.service.SpanishQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LanguageServiceFactory {
    @Autowired
    private EnglishQuestionService englishQuestionService;

    @Autowired
    private SpanishQuestionService spanishQuestionService;

    @Autowired
    private FrenchQuestionService frenchQuestionService;

    public  IQuestionService createService(String language) {
        switch (language.toLowerCase()) {
            case "en":
                return englishQuestionService;
            case "es":
                return spanishQuestionService;
            case "fr":
                return frenchQuestionService;
            default:
                throw new IllegalArgumentException("Unsupported language: " + language);
        }
    }
}
