package com.bee.beehomepagebackend.recruitment;

import com.bee.beehomepagebackend.recruitment.answer.Answer;
import com.bee.beehomepagebackend.recruitment.answer.AnswerService;
import com.bee.beehomepagebackend.recruitment.applicant.Applicant;
import com.bee.beehomepagebackend.recruitment.applicant.ApplicantService;
import com.bee.beehomepagebackend.recruitment.dto.request.ApplyRecruitServiceRequest;
import com.bee.beehomepagebackend.recruitment.dto.response.ApplyRecruitResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional
public class RecruitmentService {

    private final RecruitmentRepository recruitmentRepository;
    private final AnswerService answerService;
    private final ApplicantService applicantService;

    public ApplyRecruitResponse processApplication(ApplyRecruitServiceRequest request) {

        Recruitment recruitment = recruitmentRepository.findByGeneration(request.getGeneration());
        Applicant applicant = applicantService.registerApplicant(request, recruitment);
        Applicant updatedApplicant = addAnswersToApplicant(request, applicant);

        return ApplyRecruitResponse.builder()
                .username(updatedApplicant.getUsername())
                .generation(updatedApplicant.getGeneration().getText())
                .position(updatedApplicant.getPosition().getText())
                .build();
    }

    private Applicant addAnswersToApplicant(ApplyRecruitServiceRequest request, Applicant applicant) {
        List<Answer> answers = answerService.storeAnswers(request, applicant);
        applicant.assignAnswers(answers);
        return applicantService.storeApplicant(applicant);
    }
}
