package com.bee.beehomepagebackend.presentation.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class PresentationResponseDTO {
    private Long id;
    private String title;
    private LocalDateTime date;
    private String content;
    private String presenter;
    private LocalDateTime createdAt;
}
