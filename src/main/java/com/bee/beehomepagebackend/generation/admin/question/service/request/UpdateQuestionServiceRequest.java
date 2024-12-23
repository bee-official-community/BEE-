package com.bee.beehomepagebackend.generation.admin.question.service.request;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UpdateQuestionServiceRequest {

    private Long questionId;
    private Integer order;
    private String content;

    @Builder
    public UpdateQuestionServiceRequest(Long questionId, Integer order, String content) {
        this.questionId = questionId;
        this.order = order;
        this.content = content;
    }
}
