package com.bee.beehomepagebackend.generation.admin.question;

import com.bee.beehomepagebackend.generation.question.QuestionRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class QuestionAdminService {

    private final QuestionRepository questionRepository;



}
