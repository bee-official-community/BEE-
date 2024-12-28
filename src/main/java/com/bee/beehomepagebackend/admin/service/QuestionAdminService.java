package com.bee.beehomepagebackend.admin.service;

import com.bee.beehomepagebackend.recruitment.question.Question;
import com.bee.beehomepagebackend.recruitment.question.QuestionRepository;
import com.bee.beehomepagebackend.recruitment.question.QuestionService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Slf4j
@Service
@RequiredArgsConstructor
public class QuestionAdminService {

    private final QuestionRepository questionRepository;
    private final QuestionService questionService;

    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    @Transactional
    public Question createQuestion(int sequence, String content) {

        Question question = Question.builder()
                .sequence(sequence)
                .content(content)
                .build();

        return questionRepository.save(question);

    }

    @Transactional
    public Question updateQuestion(Long questionId, int sequence, String content) {

        Question targetQuestion = questionRepository.findById(questionId)
                .orElseThrow(() -> new EntityNotFoundException("질문을 찾을 수 없습니다."));

        targetQuestion.updateContent(content);

        return questionRepository.save(targetQuestion);
    }

    public void deleteQuestion(Long questionId) {

        Question targetQuestion = questionRepository.findById(questionId)
                .orElseThrow(() -> new EntityNotFoundException("질문을 찾을 수 없습니다."));

        List<Question> questions = questionRepository.findAll();

        Integer sequence = targetQuestion.getSequence();

        questions.stream()
                .filter(question -> sequence < question.getSequence())
                .forEach(question -> question.updateSequence(question.getSequence() - 1));

        questionRepository.saveAll(questions);

        questionRepository.deleteById(questionId);
    }

    public Question getQuestion(Long questionId) {
        return questionRepository.findById(questionId)
                .orElseThrow(() -> new EntityNotFoundException("질문을 찾을 수 없습니다."));
    }
}
