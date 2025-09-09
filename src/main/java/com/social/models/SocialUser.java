package com.social.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Main one - everything starts from here only
@Entity
public class SocialUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    // This means one user has one profile
    @OneToOne(mappedBy = "socialUser") // the entity which is using the mappedBy is not the owner
    private SocialProfile socialProfile; // in this case social profile is the owner

    // A user can make many posts
    @OneToMany(mappedBy = "socialUser")
    public List<SocialPost> user_post = new ArrayList<>();

    // A user can join many groups, and a group can have many users.
    @ManyToMany
    @JoinTable(
            name="user_group", // name for the join table
            joinColumns = @JoinColumn(name="user_id"), // foreign key column referencing SocialUser.Id
            inverseJoinColumns = @JoinColumn(name="group_id") // foreign key column referencing SocialGroup.Id
    )
    //A separate third table (user_group) will be created in the database to store these relationships
    private Set<SocialGroup> groups =  new HashSet<>();
}
