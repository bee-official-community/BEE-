package com.bee.beehomepagebackend.presentation.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
public class PresentationRequestDTO {

    @NotBlank(message = "발표 제목은 필수 입력 항목입니다.")
    private String title;

    @NotBlank(message = "발표 내용은 필수 입력 항목입니다.")
    private String content;

    @NotBlank(message = "발표자는 필수 입력 항목입니다.")
    private String presenter;
}
