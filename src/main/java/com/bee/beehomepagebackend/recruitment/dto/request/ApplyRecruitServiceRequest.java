package com.bee.beehomepagebackend.recruitment.dto.request;

import com.bee.beehomepagebackend.recruitment.enums.Generation;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class ApplyRecruitServiceRequest {

    private String username;

    private Generation generation;

    private String position;

    private String email;

    private String phoneNumber;

    private List<String> answers;

}
