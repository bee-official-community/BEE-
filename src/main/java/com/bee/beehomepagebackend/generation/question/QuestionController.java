package com.bee.beehomepagebackend.generation.question;

import com.bee.beehomepagebackend.generation.question.response.GetAllQuestionsResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/generations")
@RequiredArgsConstructor
public class QuestionController {

    @GetMapping
    public ResponseEntity<GetAllQuestionsResponse> findAllQuestions() {
        GetAllQuestionsResponse response = new GetAllQuestionsResponse();
        return ResponseEntity.ok(response);
    }

}
