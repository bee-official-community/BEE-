package com.bee.beehomepagebackend.generation.applicant.controller;

import com.bee.beehomepagebackend.generation.applicant.controller.response.CreateApplicantResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/applicants")
public class ApplicantController {

    @PostMapping
    public ResponseEntity<CreateApplicantResponse> createApplicant() {
        return ResponseEntity.ok(null);
    }
}
