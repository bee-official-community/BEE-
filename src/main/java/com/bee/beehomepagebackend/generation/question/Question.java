package com.bee.beehomepagebackend.generation.question;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Getter
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long questionId;

    private Integer order;
    private String content;

    public void updateContent(String content) {
        this.content = content;
    }
}
