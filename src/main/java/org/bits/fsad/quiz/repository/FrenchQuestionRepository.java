package org.bits.fsad.quiz.repository;

import org.bits.fsad.quiz.model.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface FrenchQuestionRepository extends MongoRepository<Question, String> {
    List<Question> findBySubcategoryAndLevel(String subcategory, String level);

}
