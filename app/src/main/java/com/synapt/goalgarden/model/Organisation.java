package com.synapt.goalgarden.model;


import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Organisation
{
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;

    @OneToMany
    private Collection<User> users;

    @OneToMany
    private Collection<Subject> subjects;
}
