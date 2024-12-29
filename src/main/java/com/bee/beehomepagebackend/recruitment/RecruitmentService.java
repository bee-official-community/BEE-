package com.bee.beehomepagebackend.recruitment;

import com.bee.beehomepagebackend.recruitment.answer.Answer;
import com.bee.beehomepagebackend.recruitment.answer.AnswerService;
import com.bee.beehomepagebackend.recruitment.applicant.Applicant;
import com.bee.beehomepagebackend.recruitment.applicant.ApplicantService;
import com.bee.beehomepagebackend.recruitment.dto.request.ApplyRecruitServiceRequest;
import com.bee.beehomepagebackend.recruitment.dto.response.ApplyRecruitResponse;
import com.bee.beehomepagebackend.recruitment.question.QuestionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class RecruitmentService {

    private final RecruitmentRepository recruitmentRepository;
    private final AnswerService answerService;
    private final ApplicantService applicantService;

    public ApplyRecruitResponse processApplication(ApplyRecruitServiceRequest request) {

        Recruitment recruitment = recruitmentRepository.findByGeneration(request.getGeneration());
        Applicant applicant = applicantService.registerApplicant(request, recruitment);
        List<Answer> answers = answerService.storeAnswers(request, applicant);
        applicant.updateAnswers(answers);
        Applicant updatedApplicant = applicantService.storeApplicant(applicant);

        log.debug("recruitment = {}, answers = {}, applicant = {}", recruitment, answers, updatedApplicant);

        return ApplyRecruitResponse.builder()
                .username(updatedApplicant.getUsername())
                .generation(updatedApplicant.getGeneration().getText())
                .position(updatedApplicant.getPosition().getText())
                .build();
    }
}
