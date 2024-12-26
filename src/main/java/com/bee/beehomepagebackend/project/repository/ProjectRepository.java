package com.bee.beehomepagebackend.project.repository;

import com.bee.beehomepagebackend.project.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {



//   특정 진행 상태의 프로젝트를 조회 (예: 진행 중, 완료 등).
    List<Project> findByStatus(String status);

//    특정 기술 스택을 사용하는 프로젝트 조회.
    List<Project> findByTechStackContaining(String techStack);

//    특정 기간 내에 시작된 프로젝트 조회.
    List<Project> findByStartDateBetween(LocalDate startDate, LocalDate endDate);

//
    boolean existsByName(String name);
}
