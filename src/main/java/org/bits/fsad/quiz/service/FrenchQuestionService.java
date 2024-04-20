package org.bits.fsad.quiz.service;

import org.bits.fsad.quiz.model.Question;
import org.bits.fsad.quiz.repository.EnglishQuestionRepository;
import org.bits.fsad.quiz.repository.FrenchQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FrenchQuestionService implements IQuestionService{
    @Autowired
    private FrenchQuestionRepository questionRepository;
    @Override
    public List<Question> getAllQuestions(String subCategory,String level) {
        return questionRepository.findBySubcategoryAndLevel(subCategory,level);
    }

}
