package com.bee.beehomepagebackend.recruitment.question;

import com.bee.beehomepagebackend.recruitment.question.response.GetQuestionResponse;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepository questionRepository;

    public List<GetQuestionResponse> getAllQuestions() {

        List<Question> questions = questionRepository.findAll();

        return questions.stream()
                .map(question ->
                        GetQuestionResponse.builder()
                                .id(question.getId())
                                .sequence(question.getSequence())
                                .content(question.getContent())
                                .build())
                .toList();
    }

    public Question getQuestionById(Long questionId) {
        return questionRepository.findById(questionId)
                .orElseThrow(() -> new EntityNotFoundException("질문을 찾을 수 없습니다."));
    }
}
