package com.bee.beehomepagebackend.recruitment.recruitment;

import com.bee.beehomepagebackend.recruitment.question.response.GetAllQuestionsResponse;
import com.bee.beehomepagebackend.recruitment.question.QuestionService;
import com.bee.beehomepagebackend.recruitment.recruitment.request.ApplyRecruitRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/recruits")
@RequiredArgsConstructor
public class RecruitmentController {

    private final RecruitmentService recruitmentService;
    private final QuestionService questionService;

    @GetMapping("/apply")
    public ResponseEntity<GetAllQuestionsResponse> getAllQuestions() {
        return ResponseEntity.ok(questionService.getAllQuestions());
    }

    @PostMapping("/apply")
    public ResponseEntity<ApplyRecruitRequest> applyRecruit() {
        return ResponseEntity.ok(null);
    }


}
