package com.social.media.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.*;

//Main one - everything starts from here only
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SocialUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // This means one user has one profile
    @OneToOne(mappedBy = "socialUser", cascade = CascadeType.ALL)  // the entity which is using the mappedBy is not the owner
    private SocialProfile socialProfile; // in this case social profile is the owner

    // A user can make many posts
    @OneToMany(mappedBy = "socialUser")
    @JsonManagedReference
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

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }
    //it is a helper method for managing the bidirectional relationship between SocialUser and SocialProfile
    public void setSocialProfile(SocialProfile socialProfile){
        socialProfile.setSocialUser(this);
        this.socialProfile=socialProfile;
    }
}
