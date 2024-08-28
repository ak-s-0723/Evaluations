package org.example.evaluations.evaluation.models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private User user;

    private String token;

    private Date ttl;

    private SessionState sessionState;
}

