package com.synapt.goalgarden.model;


import jakarta.persistence.*;

@Entity
public class Task
{
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Subject subject;
}
