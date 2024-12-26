package com.bee.beehomepagebackend.recruit.answer.service;

import com.bee.beehomepagebackend.recruit.answer.domain.Answer;
import com.bee.beehomepagebackend.recruit.answer.domain.AnswerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class AnswerService {

    private final AnswerRepository answerRepository;

    public void createAnswers() {

    }

}
