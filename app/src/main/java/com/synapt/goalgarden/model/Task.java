package com.synapt.goalgarden.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Task
{
    @Id
    @GeneratedValue
    private Long id;
}
