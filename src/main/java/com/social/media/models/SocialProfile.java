package com.social.media.models;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocialProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;   // <-- primary key for SocialProfile (independent)

    @OneToOne
    @JoinColumn(name="social_user", referencedColumnName = "Id")
    private SocialUser socialUser;  // <-- foreign key column to SocialUser.Id

}
