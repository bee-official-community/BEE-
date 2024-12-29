package com.bee.beehomepagebackend.recruitment.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Generation {

    FIRST("1기"),
    SECOND("2기"),
    THIRD("3기");

    private final String text;

    @JsonValue
    public String getText() {
        return text;
    }

    @JsonCreator
    public static Generation fromText(String text) {
        for (Generation generation : Generation.values()) {
            if (generation.text.equals(text)) {
                return generation;
            }
        }
        throw new IllegalArgumentException("존재하지 않는 기수입니다: " + text);
    }
}
