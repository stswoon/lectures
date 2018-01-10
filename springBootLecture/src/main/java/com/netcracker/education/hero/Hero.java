package com.netcracker.education.hero;

import lombok.Data;
import org.springframework.hateoas.Identifiable;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Hero")
public class Hero implements Identifiable<Long> {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private int rating;

    public Hero() {
    }

    public Hero(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }
}