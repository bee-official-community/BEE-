package com.bee.beehomepagebackend.generation.admin.question.controller.request;

import com.bee.beehomepagebackend.generation.admin.question.service.request.UpdateQuestionServiceRequest;

public class UpdateQuestionRequest {

    private Long id;
    private Integer sequence;
    private String content;

    public UpdateQuestionServiceRequest toServiceRequest() {
        return UpdateQuestionServiceRequest.builder()
                .id(id)
                .sequence(sequence)
                .content(content)
                .build();
    }
}
