package com.bee.beehomepagebackend.recruitment.answer.response;

import com.bee.beehomepagebackend.recruitment.Recruitment;
import com.bee.beehomepagebackend.recruitment.answer.Answer;
import com.bee.beehomepagebackend.recruitment.enums.Generation;
import com.bee.beehomepagebackend.recruitment.enums.Position;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class GetApplicantResponse {

    private Long id;

    private String username;

    private String generation;

    private String position;

    private String email;

    private String phoneNumber;

    @Builder
    public GetApplicantResponse(Long id, String username, String generation, String position, String email, String phoneNumber) {
        this.id = id;
        this.username = username;
        this.generation = generation;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
