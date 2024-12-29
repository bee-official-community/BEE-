package com.bee.beehomepagebackend.recruitment.question.response;

import com.bee.beehomepagebackend.recruitment.question.Question;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class GetQuestionResponse {

    private Long id;

    private int sequence;

    private String content;

    @Builder
    public GetQuestionResponse(Long id, int sequence, String content) {
        this.id = id;
        this.sequence = sequence;
        this.content = content;
    }
}
