package com.bee.beehomepagebackend.generation.question;

import com.bee.beehomepagebackend.generation.applicant.Applicant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Applicant, Long> {



}
