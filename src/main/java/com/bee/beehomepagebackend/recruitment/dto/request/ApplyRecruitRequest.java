package com.bee.beehomepagebackend.recruitment.dto.request;

import com.bee.beehomepagebackend.recruitment.enums.Generation;
import com.bee.beehomepagebackend.recruitment.enums.Position;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class ApplyRecruitRequest {

    private String username;

    private Generation generation;

    private Position position;

    private String email;

    private String phoneNumber;

    private List<ApplyRecruitAnswerRequest> answerRequests;

    @Builder
    public ApplyRecruitRequest(String username, Generation generation, Position position, String email, String phoneNumber, List<ApplyRecruitAnswerRequest> answerRequests) {
        this.username = username;
        this.generation = generation;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public ApplyRecruitServiceRequest toServiceRequest() {
        return ApplyRecruitServiceRequest.builder()
                .username(username)
                .generation(generation)
                .position(position)
                .email(email)
                .phoneNumber(phoneNumber)
                .answerRequests(answerRequests)
                .build();
    }
}
