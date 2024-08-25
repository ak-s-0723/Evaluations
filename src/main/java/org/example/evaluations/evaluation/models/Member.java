package org.example.evaluations.evaluation.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class Member {
    @Id
    private Long id;

    private String name;

    private Set<WhatsappGroup> groups=new HashSet<>();

    private List<Message> messages=new ArrayList<>();
}
