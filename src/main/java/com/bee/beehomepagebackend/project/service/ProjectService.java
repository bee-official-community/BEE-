package com.bee.beehomepagebackend.project.service;

import com.bee.beehomepagebackend.project.dto.ProjectMapper;
import com.bee.beehomepagebackend.project.dto.ProjectRequestDTO;
import com.bee.beehomepagebackend.project.dto.ProjectResponseDTO;
import com.bee.beehomepagebackend.project.entity.Project;
import com.bee.beehomepagebackend.project.exception.ProjectNotFoundException;
import com.bee.beehomepagebackend.project.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public List<ProjectResponseDTO> getAllProjects() {
        return projectRepository.findAll().stream()
                .map(ProjectMapper::toDTO)
                .collect(Collectors.toList());
    }

    public ProjectResponseDTO getProjectById(Long id) {
        Project project = projectRepository.findById(id)
                .orElseThrow(() -> new ProjectNotFoundException("Project not found with id: " + id));
        return ProjectMapper.toDTO(project);
    }

    public ProjectResponseDTO createProject(ProjectRequestDTO requestDTO) {
        // 동일한 이름의 프로젝트가 이미 존재하는지 확인
        boolean exists = projectRepository.existsByName(requestDTO.getName());
        if (exists) {
            throw new RuntimeException("이미 존재하는 프로젝트입니다: " + requestDTO.getName());
        }

        Project project = ProjectMapper.toEntity(requestDTO);
        Project savedProject = projectRepository.save(project);
        return ProjectMapper.toDTO(savedProject);
    }

    public ProjectResponseDTO updateProject(Long id, ProjectRequestDTO requestDTO) {
        Project project = projectRepository.findById(id)
                .orElseThrow(() -> new ProjectNotFoundException("Project not found with id: " + id));

        // DTO에서 전달된 값을 엔티티에 설정
        project.setName(requestDTO.getName());
        project.setDescription(requestDTO.getDescription());
        project.setStartDate(requestDTO.getStartDate());
        project.setEndDate(requestDTO.getEndDate());
        project.setTechStack(requestDTO.getTechStack());
        project.setRole(requestDTO.getRole());
        project.setStatus(requestDTO.getStatus());

        Project updatedProject = projectRepository.save(project);
        return ProjectMapper.toDTO(updatedProject);
    }

    public void deleteProject(Long id) {
        if (!projectRepository.existsById(id)) {
            throw new ProjectNotFoundException("Project not found with id: " + id);
        }
        projectRepository.deleteById(id);
    }
}
