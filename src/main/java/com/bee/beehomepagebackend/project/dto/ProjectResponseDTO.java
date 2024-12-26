package com.bee.beehomepagebackend.project.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class ProjectResponseDTO {
    private Long id;                  // 프로젝트 ID
    private String name;              // 프로젝트명
    private String description;       // 설명
    private LocalDate startDate;      // 시작일
    private LocalDate endDate;        // 종료일
    private String techStack;         // 사용 기술 스택
    private String role;              // 역할
    private String status;            // 진행 상태

}
