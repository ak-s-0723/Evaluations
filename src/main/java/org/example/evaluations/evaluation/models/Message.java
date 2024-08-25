package org.example.evaluations.evaluation.models;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Message {
    @Id
    private Long id;

    private String content;

    private Member author;

    private WhatsappGroup group;
}
