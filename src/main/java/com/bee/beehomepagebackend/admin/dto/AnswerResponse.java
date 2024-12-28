package com.bee.beehomepagebackend.admin.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class AnswerResponse {

    private int sequence;
    private String question;
    private String answer;

    @Builder
    public AnswerResponse(int sequence, String question, String answer) {
        this.sequence = sequence;
        this.question = question;
        this.answer = answer;
    }
}
