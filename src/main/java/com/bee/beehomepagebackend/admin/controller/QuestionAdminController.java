package com.bee.beehomepagebackend.admin.controller;

import com.bee.beehomepagebackend.admin.service.QuestionAdminService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Slf4j
@Controller
@RequestMapping("admin/recruits/questions")
public class QuestionAdminController {

    private final QuestionAdminService questionAdminService;

    @GetMapping
    public String adminMain(Model model) {
        model.addAttribute("questions", questionAdminService.getAllQuestions());
        return "admin-recruit-main";
    }

    @GetMapping("/create")
    public String getCreateQuestionForm() {
        return "create-question-form";
    }

    @PostMapping("/create")
    public String createQuestion(@RequestParam int sequence,
                                 @RequestParam String content) {
        questionAdminService.createQuestion(sequence, content);
        return "redirect:/admin/recruits/questions";
    }

    @GetMapping("/{questionId}")
    public String getUpdateQuestionForm(@PathVariable int questionId, Model model) {
        model.addAttribute("question", questionAdminService.getQuestion((long) questionId));
        return "update-question-form";
    }

    @PatchMapping("/{questionId}")
    public String updateQuestion(@PathVariable Long questionId,
                                 @RequestParam int sequence,
                                 @RequestParam String content) {
        questionAdminService.updateQuestion(questionId, sequence, content);
        return "redirect:/admin/recruits/questions";
    }

    @DeleteMapping("/{questionId}")
    public String deleteQuestion(@PathVariable Long questionId) {
        questionAdminService.deleteQuestion(questionId);
        return "redirect:/admin/recruits/questions";
    }
}
