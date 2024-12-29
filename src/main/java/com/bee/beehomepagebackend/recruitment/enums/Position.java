package com.bee.beehomepagebackend.recruitment.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Position {

    BACKEND_DEVELOPER("백엔드 개발자"),
    FRONTEND_DEVELOPER("프론트엔드 개발자"),
    DESIGNER("디자이너");

    private final String text;

    @JsonValue
    public String getText() {
        return text;
    }

    @JsonCreator
    public static Position fromText(String text) {
        for (Position position : Position.values()) {
            if (position.getText().equals(text)) {
                return position;
            }
        }
        throw new IllegalArgumentException("존재하지 않는 포지션입니다: " + text);
    }
}
