package com.bee.beehomepagebackend.admin.service;

import com.bee.beehomepagebackend.recruitment.answer.response.GetApplicantResponse;
import com.bee.beehomepagebackend.recruitment.applicant.Applicant;
import com.bee.beehomepagebackend.recruitment.applicant.ApplicantRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ApplicantAdminService {

    private final ApplicantRepository applicantRepository;

    public List<GetApplicantResponse> getAllApplicants() {
        List<Applicant> applicants = applicantRepository.findAll();
        return applicants.stream()
                .map(applicant -> GetApplicantResponse.builder()
                        .id(applicant.getId())
                        .username(applicant.getUsername())
                        .generation(applicant.getGeneration().getText())
                        .position(applicant.getPosition().getText())
                        .email(applicant.getEmail())
                        .phoneNumber(applicant.getPhoneNumber())
                        .build())
                .toList();

    }

    public GetApplicantResponse getApplicant(Long applicantId) {
        Applicant applicant = applicantRepository.findById(applicantId)
                .orElseThrow(() -> new EntityNotFoundException("지원자를 찾을 수 없습니다."));

        return GetApplicantResponse.builder()
                .id(applicant.getId())
                .username(applicant.getUsername())
                .generation(applicant.getGeneration().getText())
                .position(applicant.getPosition().getText())
                .email(applicant.getEmail())
                .phoneNumber(applicant.getPhoneNumber())
                .build();
    }
}
