package com.bee.beehomepagebackend.generation.question.response;

import com.bee.beehomepagebackend.generation.question.Question;
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
