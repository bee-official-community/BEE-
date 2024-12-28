package com.bee.beehomepagebackend.admin.controller;

import com.bee.beehomepagebackend.admin.service.AnswerAdminService;
import com.bee.beehomepagebackend.admin.service.ApplicantAdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/recruits/answers")
@RequiredArgsConstructor
public class AnswerAdminController {

    private final AnswerAdminService answerAdminService;
    private final ApplicantAdminService applicantAdminService;

    @GetMapping("/{applicantId}")
    public String getApplicantAnswers(@PathVariable Long applicantId, Model model) {
        model.addAttribute("answers", answerAdminService.getAnswersByApplicant(applicantId));
        model.addAttribute("applicant", applicantAdminService.getApplicant(applicantId));
        return "answers";
    }
}
