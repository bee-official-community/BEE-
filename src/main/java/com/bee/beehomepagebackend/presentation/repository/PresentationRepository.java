package com.bee.beehomepagebackend.presentation.repository;

import com.bee.beehomepagebackend.presentation.entity.Presentation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PresentationRepository extends JpaRepository<Presentation, Long> {
}
