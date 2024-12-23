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
    private Long id;

    private Integer sequence;
    private String content;

    public void updateContent(String content) {
        this.content = content;
    }

    @Builder
    public Question(Integer sequence, String content) {
        this.sequence = sequence;
        this.content = content;
    }
}
