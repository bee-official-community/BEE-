package com.bee.beehomepagebackend.presentation.dto;

import com.bee.beehomepagebackend.presentation.entity.Presentation;

public class PresentationMapper {

    public static PresentationResponseDTO toDTO(Presentation presentation) {
        PresentationResponseDTO dto = new PresentationResponseDTO();
        dto.setId(presentation.getId());
        dto.setTitle(presentation.getTitle());
        dto.setDate(presentation.getDate());
        dto.setContent(presentation.getContent());
        dto.setPresenter(presentation.getPresenter());
        return dto;
    }

    public static Presentation toEntity(PresentationRequestDTO dto) {
        Presentation presentation = new Presentation();
        presentation.setTitle(dto.getTitle());
        presentation.setContent(dto.getContent());
        presentation.setPresenter(dto.getPresenter());
        return presentation; // date는 @PrePersist로 설정됨
    }
}
