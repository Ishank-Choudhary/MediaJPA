package com.social.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class SocialGroup {

    @Id
    private Long Id;

    @ManyToMany(mappedBy = "groups")
    private Set<SocialUser> socialUsers = new HashSet<>();
}
