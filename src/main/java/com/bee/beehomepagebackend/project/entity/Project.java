package com.bee.beehomepagebackend.project.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;                  // 프로젝트 ID (Primary Key)

    @Column(nullable = false)
    private String name;              // 프로젝트명

    @Column(nullable = false)
    private String description;       // 설명

    @Column(nullable = false)
    private LocalDate startDate;      // 시작일

    private LocalDate endDate;        // 종료일 (nullable)

    @Column(nullable = false)
    private String techStack;         // 사용 기술 스택 (콤마로 구분된 문자열로 저장)

    @Column(nullable = false)
    private String role;              // 역할 (예: 개발자, 관리자)

    @Column(nullable = false)
    private String status;            // 진행 상태 (예: "진행 중", "완료")

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
