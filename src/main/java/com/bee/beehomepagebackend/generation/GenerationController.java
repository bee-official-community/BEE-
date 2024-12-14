package com.bee.beehomepagebackend.generation;

import com.bee.beehomepagebackend.generation.response.FindQuestionsResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/generations")
public class GenerationController {

    @GetMapping("/")
    public ResponseEntity<FindQuestionsResponse> findAllQuestions() {
        FindQuestionsResponse response = new FindQuestionsResponse();
        return ResponseEntity.ok(response);
    }

    @PostMapping("/update")
    public void updateQuestion() {

    }

    @PostMapping("/delete")
    public void deleteQuestion() {

    }


}
