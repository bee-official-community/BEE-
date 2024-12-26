package com.bee.beehomepagebackend.recruit.applicant.domain;

import com.bee.beehomepagebackend.recruit.Recruit;
import com.bee.beehomepagebackend.recruit.answer.domain.Answer;
import com.bee.beehomepagebackend.recruit.enums.Generation;
import com.bee.beehomepagebackend.recruit.enums.Position;
import com.bee.beehomepagebackend.recruit.question.domain.Question;
import jakarta.persistence.*;
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
    private Recruit recruit;

    @OneToMany(mappedBy = "applicant", cascade = CascadeType.ALL)
    private List<Answer> answers;

    @CreatedDate
    private LocalDateTime createdDateTime;

    @LastModifiedDate
    private LocalDateTime modifiedDateTime;

}
