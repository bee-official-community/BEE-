package com.bee.beehomepagebackend.generation.admin.question;

import com.bee.beehomepagebackend.generation.admin.question.response.CreateQuestionResponse;
import com.bee.beehomepagebackend.generation.admin.question.response.DeleteQuestionResponse;
import com.bee.beehomepagebackend.generation.admin.question.response.UpdateQuestionResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping("/api/generations/admin")
public class QuestionAdminController {

    @PostMapping("/add")
    public ResponseEntity<CreateQuestionResponse> addQuestion() {

        return ResponseEntity.ok(null);
    }

    @PostMapping("/{questionId}")
    public ResponseEntity<UpdateQuestionResponse> updateQuestion() {

        return ResponseEntity.ok(null);
    }

    @PostMapping("/{questionId}")
    public ResponseEntity<DeleteQuestionResponse> deleteQuestion() {

        return ResponseEntity.ok(null);
    }
}
