package com.bee.beehomepagebackend.recruitment.applicant.request;

import com.bee.beehomepagebackend.recruitment.answer.Answer;
import com.bee.beehomepagebackend.recruitment.recruitment.Recruitment;
import com.bee.beehomepagebackend.recruitment.recruitment.enums.Generation;
import com.bee.beehomepagebackend.recruitment.recruitment.enums.Position;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class CreateApplicantServiceRequest {

    private String username;

    private Generation generation;

    private Position position;

    private String email;

    private String phoneNumber;

    private Recruitment recruitment;

    private List<Answer> answers;

    @Builder
    public CreateApplicantServiceRequest(String username, Generation generation, Position position, String email, String phoneNumber, Recruitment recruitment, List<Answer> answers) {
        this.username = username;
        this.generation = generation;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.recruitment = recruitment;
        this.answers = answers;
    }


}
