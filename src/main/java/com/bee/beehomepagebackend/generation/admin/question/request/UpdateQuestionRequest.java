package com.bee.beehomepagebackend.generation.admin.question.request;

import lombok.Builder;

public class UpdateQuestionRequest {

    private Long questionId;
    private Integer order;
    private String content;

    public UpdateQuestionServiceRequest toServiceRequest() {
        return UpdateQuestionServiceRequest.builder()
                .questionId(questionId)
                .order(order)
                .content(content)
                .build();
    }
}
