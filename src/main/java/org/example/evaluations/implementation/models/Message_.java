package org.example.evaluations.implementation.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Message_ {
    @Id
    private Long id;

    private String content;

    @ManyToOne
    private Member_ author;

    @ManyToOne
    private WhatsappGroup_ group;
}
