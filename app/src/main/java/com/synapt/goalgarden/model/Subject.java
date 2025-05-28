package com.synapt.goalgarden.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Collection;


@Entity
public class Subject
{
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;
    private String descriptionShort;

    @OneToMany
    private Collection<Task> tasks;

    @ManyToOne
    private Organisation organisation;

//    VV LOGGING VV

    @Column(name = "create_timestamp")
    private LocalDateTime created;

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
        return this.name + " - #" + tasks.size() + " tasks";
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

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescriptionShort()
    {
        return descriptionShort;
    }

    public void setDescriptionShort(String descriptionShort)
    {
        this.descriptionShort = descriptionShort;
    }
}

