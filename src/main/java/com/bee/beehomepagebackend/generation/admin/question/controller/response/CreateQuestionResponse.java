package com.bee.beehomepagebackend.generation.admin.question.controller.response;

import com.bee.beehomepagebackend.generation.question.Question;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreateQuestionResponse {

    private Integer order;
    private String content;

    @Builder
    public CreateQuestionResponse(Integer order, String content) {
        this.order = order;
        this.content = content;
    }

    public static CreateQuestionResponse of(Question question) {
        return CreateQuestionResponse.builder()
                .order(question.getOrder())
                .content(question.getContent())
                .build();
    }
}
