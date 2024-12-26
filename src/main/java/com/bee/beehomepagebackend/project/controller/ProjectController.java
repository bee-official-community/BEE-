package com.bee.beehomepagebackend.project.controller;

import com.bee.beehomepagebackend.project.dto.ProjectRequestDTO;
import com.bee.beehomepagebackend.project.dto.ProjectResponseDTO;
import com.bee.beehomepagebackend.project.service.ProjectService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/projects")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping
    public List<ProjectResponseDTO> getAllProjects() {
        return projectService.getAllProjects();
    }

    @GetMapping("/{id}")
    public ProjectResponseDTO getProjectById(@PathVariable Long id) {
        return projectService.getProjectById(id);
    }

    @PostMapping
    public ProjectResponseDTO createProject(@RequestBody @Valid ProjectRequestDTO requestDTO) {
        return projectService.createProject(requestDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProjectResponseDTO> updateProject(
            @PathVariable Long id,
            @RequestBody @Valid ProjectRequestDTO requestDTO) {
        ProjectResponseDTO updatedProject = projectService.updateProject(id, requestDTO);
        return ResponseEntity.ok(updatedProject);
    }


    @DeleteMapping("/{id}")
    public void deleteProject(@PathVariable Long id) {
        projectService.deleteProject(id);
    }
}


