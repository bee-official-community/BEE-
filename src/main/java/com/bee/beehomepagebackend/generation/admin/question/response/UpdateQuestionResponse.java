package com.bee.beehomepagebackend.generation.admin.question.response;

import com.bee.beehomepagebackend.generation.question.Question;
import lombok.Builder;
import lombok.Getter;

@Getter
public class UpdateQuestionResponse {

    private Long questionId;
    private Integer order;
    private String content;

    @Builder
    public UpdateQuestionResponse(Long questionId, Integer order, String content) {
        this.questionId = questionId;
        this.order = order;
        this.content = content;
    }

    public static UpdateQuestionResponse of(Question question) {
        return UpdateQuestionResponse.builder()
                .questionId(question.getQuestionId())
                .order(question.getOrder())
                .content(question.getContent())
                .build();
    }
}
