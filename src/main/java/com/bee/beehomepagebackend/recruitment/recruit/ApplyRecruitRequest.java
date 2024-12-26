package com.bee.beehomepagebackend.recruitment;

import com.bee.beehomepagebackend.recruitment.answer.domain.Answer;
import com.bee.beehomepagebackend.recruitment.enums.Generation;
import com.bee.beehomepagebackend.recruitment.enums.Position;
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

    private List<Answer> answers;
}
