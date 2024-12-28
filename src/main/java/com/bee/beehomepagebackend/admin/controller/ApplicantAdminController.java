package com.bee.beehomepagebackend.admin.controller;

import com.bee.beehomepagebackend.admin.service.ApplicantAdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/recruits/applicants")
@RequiredArgsConstructor
public class ApplicantAdminController {

    private final ApplicantAdminService applicantAdminService;

    @GetMapping
    public String getApplicants(Model model) {
        model.addAttribute("applicants", applicantAdminService.getAllApplicants());
        return "applicants";
    }
}
