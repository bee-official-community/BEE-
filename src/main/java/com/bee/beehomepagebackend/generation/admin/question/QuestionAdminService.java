package com.bee.beehomepagebackend.generation.admin.question;

import com.bee.beehomepagebackend.generation.admin.question.request.UpdateQuestionServiceRequest;
import com.bee.beehomepagebackend.generation.admin.question.response.UpdateQuestionResponse;
import com.bee.beehomepagebackend.generation.question.Question;
import com.bee.beehomepagebackend.generation.question.QuestionRepository;
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
}
