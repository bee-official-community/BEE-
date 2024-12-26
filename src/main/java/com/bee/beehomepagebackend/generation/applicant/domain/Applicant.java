package com.bee.beehomepagebackend.generation.applicant.domain;

import com.bee.beehomepagebackend.generation.applicant.enums.Position;
import com.bee.beehomepagebackend.generation.question.domain.Question;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "applicant")
public class Applicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private Integer generation;

    @Enumerated(EnumType.STRING)
    private Position position;

    private String email;

    private String phoneNumber;

//    private List<Question> questions;

//    private List<Answer> answers;

    @CreatedDate
    private LocalDateTime createdDateTime;

    @LastModifiedDate
    private LocalDateTime modifiedDateTime;

}
