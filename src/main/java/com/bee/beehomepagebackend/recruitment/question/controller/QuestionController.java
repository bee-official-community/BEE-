package com.bee.beehomepagebackend.recruit.question.controller;

import com.bee.beehomepagebackend.recruit.question.service.QuestionService;
import com.bee.beehomepagebackend.recruit.question.controller.response.GetAllQuestionsResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/recruits")
@RequiredArgsConstructor
public class QuestionController {

    private final QuestionService questionService;

    @GetMapping("/apply")
    public ResponseEntity<GetAllQuestionsResponse> getAllQuestions() {
        return ResponseEntity.ok(questionService.getAllQuestions());
    }

}
