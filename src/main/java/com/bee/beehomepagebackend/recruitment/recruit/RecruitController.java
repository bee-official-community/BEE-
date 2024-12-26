package com.bee.beehomepagebackend.recruitment;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/recruits")
public class RecruitController {

    @PostMapping("/apply")
    public ResponseEntity<ApplyRecruitRequest> applyRecruit() {
        return ResponseEntity.ok(null);
    }


}
