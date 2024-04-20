package org.bits.fsad.quiz.service;

import org.bits.fsad.quiz.model.Question;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
    public interface IQuestionService {
        List<Question> getAllQuestions(String subCategory,String level);

}
