package org.bits.fsad.quiz.service;

import org.bits.fsad.quiz.model.Question;
import org.bits.fsad.quiz.repository.EnglishQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnglishQuestionService implements IQuestionService{
    @Autowired
    private EnglishQuestionRepository questionRepository;
    @Override
    public List<Question> getAllQuestions(String subCategory,String level) {
        return questionRepository.findBySubcategoryAndLevel(subCategory,level);
    }
}
