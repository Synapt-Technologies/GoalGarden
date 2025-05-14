package com.synapt.goalgarden.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.security.core.GrantedAuthority;

@Entity
class SecurityOperation implements GrantedAuthority
{
    @Id
    private String id;

    @Override
    public String getAuthority() {
        return id;
    }
}