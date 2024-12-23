package com.bee.beehomepagebackend.generation.applicant;

import com.bee.beehomepagebackend.generation.applicant.enums.Position;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Map;

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

//    private Answer answers;

}
