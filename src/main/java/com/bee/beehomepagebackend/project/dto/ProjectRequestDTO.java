package com.bee.beehomepagebackend.project.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ProjectRequestDTO {
    @NotEmpty(message = "프로젝트명은 비워둘 수 없습니다.")
    private String name;              // 프로젝트명

    @NotEmpty(message = "설명은 비워둘 수 없습니다.")
    private String description;       // 설명

    @NotNull(message = "시작일은 필수 입력 항목입니다.")
    private LocalDate startDate;      // 시작일

    private LocalDate endDate;        // 종료일

    @NotEmpty(message = "사용 기술 스택은 비워둘 수 없습니다.")
    private String techStack;         // 사용 기술 스택

    @NotEmpty(message = "역할은 비워둘 수 없습니다.")
    private String role;              // 역할

    @NotEmpty(message = "진행 상태는 비워둘 수 없습니다.")
    private String status;            // 진행 상태
}
