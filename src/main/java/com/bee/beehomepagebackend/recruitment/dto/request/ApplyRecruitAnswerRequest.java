package com.bee.beehomepagebackend.recruitment.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ApplyRecruitAnswerRequest {

    private Long questionId;
    private String content;

    @Builder
    public ApplyRecruitAnswerRequest(Long questionId, String content) {
        this.questionId = questionId;
        this.content = content;
    }

}
