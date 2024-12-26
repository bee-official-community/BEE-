package com.bee.beehomepagebackend.presentation.service;

import com.bee.beehomepagebackend.presentation.dto.PresentationMapper;
import com.bee.beehomepagebackend.presentation.dto.PresentationRequestDTO;
import com.bee.beehomepagebackend.presentation.dto.PresentationResponseDTO;
import com.bee.beehomepagebackend.presentation.entity.Presentation;
import com.bee.beehomepagebackend.presentation.repository.PresentationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PresentationService {

    @Autowired
    private PresentationRepository presentationRepository;

    public List<PresentationResponseDTO> getAllPresentations() {
        return presentationRepository.findAll().stream()
                .map(PresentationMapper::toDTO)
                .collect(Collectors.toList());
    }

    public PresentationResponseDTO getPresentationById(Long id) {
        Presentation presentation = presentationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Presentation not found with id: " + id));
        return PresentationMapper.toDTO(presentation);
    }

    public PresentationResponseDTO createPresentation(PresentationRequestDTO requestDTO) {
        // 요청 데이터를 엔티티로 변환
        Presentation presentation = PresentationMapper.toEntity(requestDTO);

        // 등록 시간(발표 일시) 설정
        presentation.setDate(LocalDateTime.now());

        // 데이터베이스에 저장
        Presentation savedPresentation = presentationRepository.save(presentation);
        return PresentationMapper.toDTO(savedPresentation);
    }

    public PresentationResponseDTO updatePresentation(Long id, PresentationRequestDTO requestDTO) {
        Presentation presentation = presentationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Presentation not found with id: " + id));

        // 수정 가능한 필드만 업데이트
        presentation.setTitle(requestDTO.getTitle());
        presentation.setContent(requestDTO.getContent());
        presentation.setPresenter(requestDTO.getPresenter());

        // date 필드는 수정하지 않음
        Presentation updatedPresentation = presentationRepository.save(presentation);
        return PresentationMapper.toDTO(updatedPresentation);
    }

    public void deletePresentation(Long id) {
        if (!presentationRepository.existsById(id)) {
            throw new RuntimeException("Presentation not found with id: " + id);
        }
        presentationRepository.deleteById(id);
    }
}
