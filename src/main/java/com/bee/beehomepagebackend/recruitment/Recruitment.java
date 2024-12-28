package com.bee.beehomepagebackend.recruitment;

import com.bee.beehomepagebackend.recruitment.applicant.Applicant;
import com.bee.beehomepagebackend.recruitment.enums.Generation;
import com.bee.beehomepagebackend.recruitment.question.Question;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Entity
@NoArgsConstructor
@Table(name = "recruitment")
public class Recruitment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Generation generation;

    @OneToMany(mappedBy = "recruitment", cascade = CascadeType.ALL)
    private List<Applicant> applicants;

    @OneToMany(mappedBy = "recruitment", cascade = CascadeType.ALL)
    private List<Question> questions;

    @CreatedDate
    private LocalDateTime createdDateTime;

    @LastModifiedDate
    private LocalDateTime modifiedDateTime;

    @Builder
    public Recruitment(Generation generation, List<Applicant> applicants, List<Question> questions) {
        this.generation = generation;
        this.applicants = applicants;
        this.questions = questions;
    }
}
