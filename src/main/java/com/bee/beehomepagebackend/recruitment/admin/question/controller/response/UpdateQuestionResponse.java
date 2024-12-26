package com.bee.beehomepagebackend.recruit.admin.question.controller.response;

import com.bee.beehomepagebackend.recruit.question.domain.Question;
import lombok.Builder;
import lombok.Getter;

@Getter
public class UpdateQuestionResponse {

    private Long id;
    private Integer sequence;
    private String content;

    @Builder
    public UpdateQuestionResponse(Long id, Integer sequence, String content) {
        this.id = id;
        this.sequence = sequence;
        this.content = content;
    }

    public static UpdateQuestionResponse of(Question question) {
        return UpdateQuestionResponse.builder()
                .id(question.getId())
                .sequence(question.getSequence())
                .content(question.getContent())
                .build();
    }
}
