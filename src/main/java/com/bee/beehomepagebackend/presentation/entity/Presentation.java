package com.bee.beehomepagebackend.presentation.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Presentation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private LocalDateTime date; // 발표 일시 (등록 시간으로 자동 설정)

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String presenter;

    @PrePersist
    protected void onCreate() {
        LocalDateTime now = LocalDateTime.now();
        this.date = now; // 현재 시간으로 발표 일시 설정
    }
}
