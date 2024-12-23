package com.bee.beehomepagebackend.generation.admin.question.request;

import com.bee.beehomepagebackend.generation.question.Question;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreateQuestionServiceRequest {

    private Integer order;
    private String content;

    @Builder
    public CreateQuestionServiceRequest(Integer order, String content) {
        this.order = order;
        this.content = content;
    }

    public Question toEntity() {
        return Question.builder()
                .order(order)
                .content(content)
                .build();
    }
}
