package com.bee.beehomepagebackend.generation.admin.question.controller;

import com.bee.beehomepagebackend.generation.admin.question.service.QuestionAdminService;
import com.bee.beehomepagebackend.generation.admin.question.controller.request.CreateQuestionRequest;
import com.bee.beehomepagebackend.generation.admin.question.controller.request.UpdateQuestionRequest;
import com.bee.beehomepagebackend.generation.admin.question.controller.response.CreateQuestionResponse;
import com.bee.beehomepagebackend.generation.admin.question.controller.response.UpdateQuestionResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/api/generations/questions/admin")
public class QuestionAdminController {

    private final QuestionAdminService questionAdminService;

    @PostMapping
    public ResponseEntity<CreateQuestionResponse> createQuestion(@RequestBody CreateQuestionRequest request) {
        return ResponseEntity.ok(questionAdminService.createQuestion(request.toServiceRequest()));
    }

    @PatchMapping("/{questionId}")
    public ResponseEntity<UpdateQuestionResponse> updateQuestion(@PathVariable Long questionId,
                                                                 @RequestBody UpdateQuestionRequest request) {
        return ResponseEntity.ok(questionAdminService.updateQuestion(questionId, request.toServiceRequest()));
    }

    @DeleteMapping("/{questionId}")
    public ResponseEntity<String> deleteQuestion(@PathVariable Long questionId) {
        questionAdminService.deleteQuestion(questionId);
        return ResponseEntity.ok("질문이 성공적으로 삭제되었습니다.");
    }
}
