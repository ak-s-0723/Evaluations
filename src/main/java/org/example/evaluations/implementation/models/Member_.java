package org.example.evaluations.implementation.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Member_ {
    @Id
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name="members_whatsapp_groups_",joinColumns = @JoinColumn(name="member_id_"),inverseJoinColumns = @JoinColumn(name="whatsapp_group_id_"))
    private Set<WhatsappGroup_> groups=new HashSet<>();

    @OneToMany(mappedBy = "author")
    private List<Message_> messages=new ArrayList<>();
}
