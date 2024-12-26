package com.bee.beehomepagebackend.generation.admin.question.service;

import com.bee.beehomepagebackend.generation.admin.question.service.request.CreateQuestionServiceRequest;
import com.bee.beehomepagebackend.generation.admin.question.service.request.UpdateQuestionServiceRequest;
import com.bee.beehomepagebackend.generation.admin.question.controller.response.CreateQuestionResponse;
import com.bee.beehomepagebackend.generation.admin.question.controller.response.UpdateQuestionResponse;
import com.bee.beehomepagebackend.generation.question.domain.Question;
import com.bee.beehomepagebackend.generation.question.domain.QuestionRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class QuestionAdminService {

    private final QuestionRepository questionRepository;


    public void deleteQuestion(Long questionId) {

        questionRepository.deleteById(questionId);
    }

    @Transactional
    public UpdateQuestionResponse updateQuestion(Long questionId, UpdateQuestionServiceRequest request) {

        Question question = questionRepository.findById(questionId)
                .orElseThrow(() -> new EntityNotFoundException("질문을 찾을 수 없습니다."));

        question.updateContent(request.getContent());

        return UpdateQuestionResponse.of(question);
    }

    @Transactional
    public CreateQuestionResponse createQuestion(CreateQuestionServiceRequest request) {

        Question question = request.toEntity();
        Question savedQuestion = questionRepository.save(question);

        return CreateQuestionResponse.of(savedQuestion);

    }
}
