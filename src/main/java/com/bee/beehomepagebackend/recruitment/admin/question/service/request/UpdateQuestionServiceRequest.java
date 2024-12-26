package com.bee.beehomepagebackend.recruit.admin.question.service.request;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class UpdateQuestionServiceRequest {

    private Long id;
    private Integer sequence;
    private String content;

    @Builder
    public UpdateQuestionServiceRequest(Long id, Integer sequence, String content) {
        this.id = id;
        this.sequence = sequence;
        this.content = content;
    }
}
