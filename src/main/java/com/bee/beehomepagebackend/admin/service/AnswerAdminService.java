package com.bee.beehomepagebackend.admin.service;

import com.bee.beehomepagebackend.admin.dto.AnswerResponse;
import com.bee.beehomepagebackend.recruitment.answer.Answer;
import com.bee.beehomepagebackend.recruitment.answer.AnswerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class AnswerAdminService {

    private final AnswerRepository answerRepository;

    public List<AnswerResponse> getAnswersByApplicant(Long applicantId) {
        List<Answer> answers = answerRepository.findByApplicantId(applicantId);

        return answers.stream()
                .map(answer -> AnswerResponse.builder()
                        .sequence(answer.getQuestion().getSequence())
                        .question(answer.getQuestion().getContent())
                        .answer(answer.getContent())
                        .build())
                .collect(Collectors.toList());
    }

}
