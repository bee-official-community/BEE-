package com.bee.beehomepagebackend.generation.question;

import jakarta.persistence.*;
import lombok.Builder;
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

    @Builder
    public Question(Integer order, String content) {
        this.order = order;
        this.content = content;
    }
}
