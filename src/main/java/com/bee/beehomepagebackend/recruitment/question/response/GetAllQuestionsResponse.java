package com.bee.beehomepagebackend.recruitment.question.response;

import com.bee.beehomepagebackend.recruitment.question.Question;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class GetAllQuestionsResponse {

    private List<Question> questions;

    @Builder
    public GetAllQuestionsResponse(List<Question> questions) {
        this.questions = questions;
    }
}
