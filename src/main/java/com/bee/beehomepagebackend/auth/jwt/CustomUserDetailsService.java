package com.bee.beehomepagebackend.auth.jwt;

import org.springframework.security.core.userdetails.UserDetails;

public class CustomUserDetailsService {
    public UserDetails loadUserByUsername(String name) {
        return loadUserByUsername("");
    }
}
