package com.bee.beehomepagebackend.presentation.controller;

import com.bee.beehomepagebackend.presentation.dto.PresentationRequestDTO;
import com.bee.beehomepagebackend.presentation.dto.PresentationResponseDTO;
import com.bee.beehomepagebackend.presentation.service.PresentationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/presentations")
public class PresentationController {

    @Autowired
    private PresentationService presentationService;

    @GetMapping
    public ResponseEntity<List<PresentationResponseDTO>> getAllPresentations() {
        List<PresentationResponseDTO> presentations = presentationService.getAllPresentations();
        return ResponseEntity.ok(presentations);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PresentationResponseDTO> getPresentationById(@PathVariable Long id) {
        PresentationResponseDTO presentation = presentationService.getPresentationById(id);
        return ResponseEntity.ok(presentation);
    }

    @PostMapping
    public ResponseEntity<PresentationResponseDTO> createPresentation(
            @RequestBody @Valid PresentationRequestDTO requestDTO) {
        PresentationResponseDTO createdPresentation = presentationService.createPresentation(requestDTO);
        return ResponseEntity.ok(createdPresentation);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PresentationResponseDTO> updatePresentation(
            @PathVariable Long id,
            @RequestBody @Valid PresentationRequestDTO requestDTO) {
        PresentationResponseDTO updatedPresentation = presentationService.updatePresentation(id, requestDTO);
        return ResponseEntity.ok(updatedPresentation);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePresentation(@PathVariable Long id) {
        presentationService.deletePresentation(id);
        return ResponseEntity.noContent().build();
    }
}
