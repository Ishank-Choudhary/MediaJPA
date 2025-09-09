package com.social.models;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class SocialProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;   // <-- primary key for SocialProfile (independent)

    @OneToOne
    @JoinColumn(name="social_user", referencedColumnName = "Id")
    private SocialUser socialUser;  // <-- foreign key column to SocialUser.Id

}
