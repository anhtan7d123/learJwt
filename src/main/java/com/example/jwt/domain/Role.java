package com.example.jwt.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String roleName;

    @ManyToMany(mappedBy = "roles")
    @JsonBackReference
    private Collection<User> users;

    public Role() {

    }
}
