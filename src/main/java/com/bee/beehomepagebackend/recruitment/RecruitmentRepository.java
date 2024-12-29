package com.bee.beehomepagebackend.recruitment;

import com.bee.beehomepagebackend.recruitment.enums.Generation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RecruitmentRepository extends JpaRepository<Recruitment, Long> {

    @Query("select r from Recruitment r where r.generation = :generation")
    Recruitment findByGeneration(@Param("generation") Generation generation);
}
