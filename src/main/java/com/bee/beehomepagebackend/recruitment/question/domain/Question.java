package com.bee.beehomepagebackend.recruit.question.domain;

import com.bee.beehomepagebackend.recruit.Recruit;
import com.bee.beehomepagebackend.recruit.answer.domain.Answer;
import com.bee.beehomepagebackend.recruit.applicant.domain.Applicant;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@Entity
@Getter
@Table(name = "question")
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "recruit_id")
    private Recruit recruit;

    private Integer sequence;

    private String content;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<Answer> answers;

    @CreatedDate
    private LocalDateTime createdDateTime;

    @LastModifiedDate
    private LocalDateTime modifiedDateTime;

    public void updateContent(String content) {
        this.content = content;
    }

    @Builder
    public Question(Integer sequence, String content) {
        this.sequence = sequence;
        this.content = content;
    }
}
