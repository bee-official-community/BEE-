package com.bee.beehomepagebackend.recruitment;

import com.bee.beehomepagebackend.recruitment.applicant.domain.Applicant;
import com.bee.beehomepagebackend.recruitment.enums.Generation;
import com.bee.beehomepagebackend.recruitment.question.domain.Question;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "recruit")
public class Recruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Generation generation;

    @OneToMany(mappedBy = "recruit", cascade = CascadeType.ALL)
    private List<Applicant> applicants;

    @OneToMany(mappedBy = "recruit", cascade = CascadeType.ALL)
    private List<Question> questions;

    @CreatedDate
    private LocalDateTime createdDateTime;

    @LastModifiedDate
    private LocalDateTime modifiedDateTime;
}
