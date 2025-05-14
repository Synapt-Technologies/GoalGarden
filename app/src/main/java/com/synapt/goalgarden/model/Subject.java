package com.synapt.goalgarden.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;


@Entity
public class Subject
{
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String description;

    @ManyToOne
    private User creator;

    //    @CreatedDate // Doesn't work. Hibernate feature?
    @Column(name = "create_timestamp")
    private LocalDateTime created;

    //    @LastModifiedDate // Doesn't work. Hibernate feature?
    @Column(name = "modified_timestamp")
    private LocalDateTime modified;

    @PrePersist
    protected void onCreate()
    {
        this.created = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate()
    {
        this.modified = LocalDateTime.now();
    }

    @Override
    public String toString()
    {
        return this.title + " - #" + 0 + " tasks";
    }

    // V GETTERS AND SETTERS V

    public Long getId()
    {
        return id;
    }

    public LocalDateTime getCreated()
    {
        return created;
    }

    public LocalDateTime getModified()
    {
        return modified;
    }

    public User getCreator()
    {
        return creator;
    }

    public void setCreator(User creator)
    {
        this.creator = creator;
    }
}

