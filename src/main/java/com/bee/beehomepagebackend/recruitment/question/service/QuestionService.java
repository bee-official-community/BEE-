package com.bee.beehomepagebackend.recruit.question.service;

import com.bee.beehomepagebackend.recruit.question.domain.Question;
import com.bee.beehomepagebackend.recruit.question.domain.QuestionRepository;
import com.bee.beehomepagebackend.recruit.question.controller.response.GetAllQuestionsResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository;

    public GetAllQuestionsResponse getAllQuestions() {

        List<Question> questions = questionRepository.findAll();

        return GetAllQuestionsResponse.builder()
                .questions(questions)
                .build();
    }
}
