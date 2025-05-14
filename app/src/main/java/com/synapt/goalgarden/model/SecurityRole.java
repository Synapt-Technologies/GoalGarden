package com.synapt.goalgarden.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import org.springframework.security.core.GrantedAuthority;

import java.util.ArrayList;
import java.util.Collection;

@Entity
class SecurityRole implements GrantedAuthority
{
    @Id
    private String id;

    @ManyToMany
    private final Collection<SecurityOperation> allowedOperations = new ArrayList<>();

    @Override
    public String getAuthority() {
        return id;
    }

    public Collection<SecurityOperation> getAllowedOperations() {
        return this.allowedOperations;
    }
}