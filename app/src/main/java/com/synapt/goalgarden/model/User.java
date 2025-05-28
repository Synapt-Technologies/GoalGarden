package com.synapt.goalgarden.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Table(name = "users")
public class User
{
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String name;
    private String surname;
    //    @CreatedDate // Doesn't work. Hibernate feature?
    @Column(name = "create_timestamp")
    private LocalDateTime created;

    //    @LastModifiedDate // Doesn't work. Hibernate feature?
    @Column(name = "modified_timestamp")
    private LocalDateTime modified;

    @ManyToMany
    private final Collection<SecurityRole> roles = new ArrayList<>();

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
        return '@' + this.username;
    }

    // V GETTERS AND SETTERS V

    public Long getId()
    {
        return id;
    }

    public String getUsername()
    {
        return name;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public Collection<SecurityRole> getRoles()
    {
        return roles;
    }

    public LocalDateTime getCreated()
    {
        return created;
    }

    public LocalDateTime getModified()
    {
        return modified;
    }
}

