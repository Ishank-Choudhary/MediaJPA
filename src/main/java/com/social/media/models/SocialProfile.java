package com.social.media.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private Long id;   // <-- primary key for SocialProfile (independent)

    @OneToOne
    @JoinColumn(name="social_user", referencedColumnName = "Id")
    @JsonIgnore
    private SocialUser socialUser;  // <-- foreign key column to SocialUser.Id
    private String description;

}
