package com.bee.beehomepagebackend.project.dto;

import com.bee.beehomepagebackend.project.entity.Project;

public class ProjectMapper {

    // 엔티티를 DTO로 변환
    public static ProjectResponseDTO toDTO(Project project) {
        ProjectResponseDTO dto = new ProjectResponseDTO();
        dto.setId(project.getId());
        dto.setName(project.getName());
        dto.setDescription(project.getDescription());
        dto.setStartDate(project.getStartDate());
        dto.setEndDate(project.getEndDate());
        dto.setTechStack(project.getTechStack());
        dto.setRole(project.getRole());
        dto.setStatus(project.getStatus());
        return dto;
    }

    // DTO를 엔티티로 변환
    public static Project toEntity(ProjectRequestDTO dto) {
        Project project = new Project();
        project.setName(dto.getName());
        project.setDescription(dto.getDescription());
        project.setStartDate(dto.getStartDate());
        project.setEndDate(dto.getEndDate());
        project.setTechStack(dto.getTechStack());
        project.setRole(dto.getRole());
        project.setStatus(dto.getStatus());
        return project;
    }
}
