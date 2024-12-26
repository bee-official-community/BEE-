package com.bee.beehomepagebackend.recruit.admin.question.service.request;

import com.bee.beehomepagebackend.recruit.question.domain.Question;
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
