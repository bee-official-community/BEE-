package com.bee.beehomepagebackend.generation;

import com.bee.beehomepagebackend.generation.enums.Position;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class Generation {

    private Long id;
    private String username;
    private Position position;
    private String email;
    private Map<String, String> questions;

}
