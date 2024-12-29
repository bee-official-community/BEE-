package com.bee.beehomepagebackend.recruitment.applicant;

import com.bee.beehomepagebackend.recruitment.Recruitment;
import com.bee.beehomepagebackend.recruitment.answer.Answer;
import com.bee.beehomepagebackend.recruitment.dto.request.ApplyRecruitServiceRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ApplicantService {

    private final ApplicantRepository applicantRepository;

    public Applicant registerApplicant(ApplyRecruitServiceRequest request, Recruitment recruitment) {
        Applicant applicant = Applicant.builder()
                .username(request.getUsername())
                .generation(request.getGeneration())
                .position(request.getPosition())
                .email(request.getEmail())
                .phoneNumber(request.getPhoneNumber())
                .recruitment(recruitment)
                .build();

        return applicantRepository.save(applicant);
    }

    public Applicant storeApplicant(Applicant applicant) {
        return applicantRepository.save(applicant);
    }
}
