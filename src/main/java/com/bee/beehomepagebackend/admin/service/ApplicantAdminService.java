package com.bee.beehomepagebackend.admin.service;

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

    public List<Applicant> getAllApplicants() {
        return applicantRepository.findAll();
    }

    public Applicant getApplicant(Long applicantId) {
        return applicantRepository.findById(applicantId)
                .orElseThrow(() -> new EntityNotFoundException("지원자를 찾을 수 없습니다."));
    }
}
