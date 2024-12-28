package com.bee.beehomepagebackend.recruitment.recruitment.request;

import com.bee.beehomepagebackend.recruitment.applicant.Applicant;
import com.bee.beehomepagebackend.recruitment.question.Question;
import com.bee.beehomepagebackend.recruitment.recruitment.enums.Generation;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Getter
public class CreateRecruitServiceRequest {

    private Generation generation;

    private List<Applicant> applicants;

    private List<Question> questions;

    @Builder
    public CreateRecruitServiceRequest(Generation generation, List<Applicant> applicants, List<Question> questions) {
        this.generation = generation;
        this.applicants = applicants;
        this.questions = questions;
    }
}
