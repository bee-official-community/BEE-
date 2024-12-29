package com.bee.beehomepagebackend.recruitment.applicant;

import com.bee.beehomepagebackend.recruitment.Recruitment;
import com.bee.beehomepagebackend.recruitment.answer.Answer;
import com.bee.beehomepagebackend.recruitment.enums.Generation;
import com.bee.beehomepagebackend.recruitment.enums.Position;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
@Table(name = "applicant")
public class Applicant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    @Enumerated(EnumType.STRING)
    private Generation generation;

    @Enumerated(EnumType.STRING)
    private Position position;

    private String email;

    private String phoneNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recruit_id")
    private Recruitment recruitment;

    @OneToMany(mappedBy = "applicant", cascade = CascadeType.ALL)
    private List<Answer> answers;

    @CreatedDate
    private LocalDateTime createdDateTime;

    @LastModifiedDate
    private LocalDateTime modifiedDateTime;

    @Builder
    public Applicant(String username, Generation generation, Position position, String email, String phoneNumber, Recruitment recruitment, List<Answer> answers) {
        this.username = username;
        this.generation = generation;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.recruitment = recruitment;
        this.answers = answers;
    }

    public void updateAnswers(List<Answer> answers) {
        this.answers = answers;
    }
}
