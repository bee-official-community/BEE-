package com.bee.beehomepagebackend.generation.question.domain;

import com.bee.beehomepagebackend.generation.answer.domain.Answer;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

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

    @OneToOne
    private Answer answer;

    @CreatedDate
    private LocalDateTime createdDateTime;

    @LastModifiedDate
    private LocalDateTime modifiedDateTime;

    public void updateContent(String content) {
        this.content = content;
    }

    @Builder
    public Question(Integer sequence, String content) {
        this.sequence = sequence;
        this.content = content;
    }
}
