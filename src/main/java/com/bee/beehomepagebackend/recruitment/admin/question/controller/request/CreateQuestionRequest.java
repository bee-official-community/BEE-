package com.bee.beehomepagebackend.recruit.admin.question.controller.request;

import com.bee.beehomepagebackend.recruit.admin.question.service.request.CreateQuestionServiceRequest;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreateQuestionRequest {

    private Integer sequence;
    private String content;

    @Builder
    public CreateQuestionRequest(Integer sequence, String content) {
        this.sequence = sequence;
        this.content = content;
    }

    public CreateQuestionServiceRequest toServiceRequest() {
        return CreateQuestionServiceRequest.builder()
                .sequence(sequence)
                .content(content)
                .build();
    }
}
