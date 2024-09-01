package org.example.evaluations.implementation.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="publication_type_",discriminatorType = DiscriminatorType.STRING)
public abstract class Publication_ {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Version
    private int version;

    private String title;

    private LocalDate publishingDate;

    @ManyToMany
    @JoinTable(
            name = "PUBLICATIONS_AUTHORS_",
            joinColumns = {@JoinColumn(name = "PUBLICATION_ID", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "AUTHOR_ID", referencedColumnName = "id")})
    private Set<Author_> authors = new HashSet<>();
}
