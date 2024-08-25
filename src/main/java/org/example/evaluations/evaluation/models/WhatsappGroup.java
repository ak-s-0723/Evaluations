package org.example.evaluations.evaluation.models;

import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class WhatsappGroup {
    @Id
    private Long id;

    private String name;

    private String description;

    private Set<Member> members;

    private List<Message> messages;
}
