package com.bee.beehomepagebackend.recruitment.answer;

import com.bee.beehomepagebackend.recruitment.applicant.Applicant;
import com.bee.beehomepagebackend.recruitment.question.Question;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class AnswerService {

    private final AnswerRepository answerRepository;

    public void createAnswers(Applicant applicant, Question question, List<String> answers) {

        answers.stream()
                .forEach(answer ->
                        Answer.builder()
                                .applicant(applicant)
                                .question(question)
                                .content(answer)
                                .build());

    }

}
