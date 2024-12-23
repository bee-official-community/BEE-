package com.bee.beehomepagebackend.generation.admin.question.service.request;

import com.bee.beehomepagebackend.generation.question.Question;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreateQuestionServiceRequest {

    private Integer sequence;
    private String content;

    @Builder
    public CreateQuestionServiceRequest(Integer sequence, String content) {
        this.sequence = sequence;
        this.content = content;
    }

    public Question toEntity() {
        return Question.builder()
                .sequence(sequence)
                .content(content)
                .build();
    }
}