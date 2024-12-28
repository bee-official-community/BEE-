package com.bee.beehomepagebackend.recruitment.question;

import com.bee.beehomepagebackend.recruitment.Recruitment;
import com.bee.beehomepagebackend.recruitment.answer.Answer;
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
    private Recruitment recruitment;

    private Integer sequence;

    private String content;

    @OneToMany(mappedBy = "question", cascade = CascadeType.ALL)
    private List<Answer> answers;

    @CreatedDate
    private LocalDateTime createdDateTime;

    @LastModifiedDate
    private LocalDateTime modifiedDateTime;

    @Builder
    public Question(Recruitment recruitment, Integer sequence, String content) {
        this.recruitment = recruitment;
        this.sequence = sequence;
        this.content = content;
    }

    public void updateContent(String content) {
        this.content = content;
    }

    public void updateSequence(int sequence) {
        this.sequence = sequence;
    }
}
