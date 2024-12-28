package com.bee.beehomepagebackend.recruitment.answer.request;

import com.bee.beehomepagebackend.recruitment.applicant.Applicant;
import com.bee.beehomepagebackend.recruitment.question.Question;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CreateAnswerServiceRequest {

    private Applicant applicant;

    private Question question;

    private String content;

    @Builder
    public CreateAnswerServiceRequest(Applicant applicant, Question question, String content) {
        this.applicant = applicant;
        this.question = question;
        this.content = content;
    }
}
