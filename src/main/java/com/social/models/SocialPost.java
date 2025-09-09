package com.social.models;

import jakarta.persistence.*;

@Entity
public class SocialPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long Id;

    @ManyToOne
    @JoinColumn(name="user_id")
    public SocialUser socialUser;
}
