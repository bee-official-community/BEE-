package com.bee.beehomepagebackend.recruitment.dto.response;

import com.bee.beehomepagebackend.recruitment.enums.Position;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ApplyRecruitResponse {

    private String username;

    private String generation;

    private String position;

    @Builder
    public ApplyRecruitResponse(String username, String generation, String position) {
        this.username = username;
        this.generation = generation;
        this.position = position;
    }
}
