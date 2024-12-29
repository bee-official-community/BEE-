package com.bee.beehomepagebackend.recruitment.answer;

import com.bee.beehomepagebackend.recruitment.applicant.Applicant;
import com.bee.beehomepagebackend.recruitment.dto.request.ApplyRecruitServiceRequest;
import com.bee.beehomepagebackend.recruitment.question.QuestionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class AnswerService {

    private final AnswerRepository answerRepository;
    private final QuestionService questionService;

    public List<Answer> storeAnswers(ApplyRecruitServiceRequest request, Applicant applicant) {

        List<Answer> answers = request.getAnswerRequests().stream()
                .map(answer -> Answer.builder()
                        .applicant(applicant)
                        .question(questionService.getQuestionById(answer.getQuestionId()))
                        .content(answer.getContent())
                        .build())
                .toList();

        return answerRepository.saveAll(answers);
    }
}
