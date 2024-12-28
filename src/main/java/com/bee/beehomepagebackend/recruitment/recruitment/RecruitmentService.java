package com.bee.beehomepagebackend.recruitment.recruitment;

import com.bee.beehomepagebackend.recruitment.answer.AnswerService;
import com.bee.beehomepagebackend.recruitment.applicant.ApplicantService;
import com.bee.beehomepagebackend.recruitment.recruitment.request.ApplyRecruitServiceRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class RecruitmentService {

    private final RecruitmentRepository recruitmentRepository;
    private final AnswerService answerService;
    private final ApplicantService applicantService;


    public void processApplication(ApplyRecruitServiceRequest request) {

//        List<Answer> answers = answerService.createAnswers(request.toAnswerService);
//        Applicant applicant = applicantService.createApplicant(request.toApplicantService);

    }
}
