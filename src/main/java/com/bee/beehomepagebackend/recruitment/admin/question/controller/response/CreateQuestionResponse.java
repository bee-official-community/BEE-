package com.bee.beehomepagebackend.recruit.admin.question.controller.response;

import com.bee.beehomepagebackend.recruit.question.domain.Question;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreateQuestionResponse {

    private Integer sequence;
    private String content;

    @Builder
    public CreateQuestionResponse(Integer sequence, String content) {
        this.sequence = sequence;
        this.content = content;
    }

    public static CreateQuestionResponse of(Question question) {
        return CreateQuestionResponse.builder()
                .sequence(question.getSequence())
                .content(question.getContent())
                .build();
    }
}
