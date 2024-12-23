package com.bee.beehomepagebackend.generation.admin.question.request;

import lombok.Builder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CreateQuestionRequest {

    private Integer order;
    private String content;

    @Builder
    public CreateQuestionRequest(Integer order, String content) {
        this.order = order;
        this.content = content;
    }
}
