package com.social.media.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class SocialGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)   // Add this line
    private Long Id;

    @ManyToMany(mappedBy = "groups")
    private Set<SocialUser> socialUsers = new HashSet<>();
}
