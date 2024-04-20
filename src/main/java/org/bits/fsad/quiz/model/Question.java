package org.bits.fsad.quiz.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "en")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {


    @Id
    private String id;
    private String language;
    private String subcategory;
    private String level;
    private String questionText;
    private String[] options;

    private boolean active;
    private int correctOptionIndex;
}
