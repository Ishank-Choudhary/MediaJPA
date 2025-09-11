package com.social.media;

import com.social.media.repositories.SocialPostRepo;
import com.social.media.repositories.SocialProfileRepo;
import com.social.media.repositories.SocialGroupRepo;
import com.social.media.repositories.SocialUserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.social.media.models.SocialPost;
import com.social.media.models.SocialGroup;
import com.social.media.models.SocialProfile;
import com.social.media.models.SocialUser;

@Configuration
public class DataInitializer {

    private final SocialUserRepo userRepository;
    private final SocialGroupRepo groupRepository;
    private final SocialProfileRepo profileRepository;
    private final SocialPostRepo postRepository;

    public DataInitializer(SocialUserRepo userRepository,
                           SocialGroupRepo groupRepository,
                           SocialProfileRepo profileRepository,
                           SocialPostRepo postRepository) {
        this.userRepository = userRepository;
        this.groupRepository = groupRepository;
        this.profileRepository = profileRepository;
        this.postRepository = postRepository;
    }

    @Bean
    public CommandLineRunner initializeData() {
        return args -> {
            // Create users
            SocialUser user1 = new SocialUser();
            SocialUser user2 = new SocialUser();
            SocialUser user3 = new SocialUser();
            userRepository.save(user1);
            userRepository.save(user2);
            userRepository.save(user3);

            // Create groups
            SocialGroup group1 = new SocialGroup();
            SocialGroup group2 = new SocialGroup();

            // Helper method to maintain both sides of relationship
            addUserToGroup(user1, group1);
            addUserToGroup(user2, group1);
            addUserToGroup(user2, group2);
            addUserToGroup(user3, group2);

            // Save groups
            groupRepository.save(group1);
            groupRepository.save(group2);

            // Save updated users
            userRepository.save(user1);
            userRepository.save(user2);
            userRepository.save(user3);

            // Create posts
            SocialPost post1 = new SocialPost();
            post1.setSocialUser(user1);

            SocialPost post2 = new SocialPost();
            post2.setSocialUser(user2);

            SocialPost post3 = new SocialPost();
            post3.setSocialUser(user3);

            postRepository.save(post1);
            postRepository.save(post2);
            postRepository.save(post3);

            // Create profiles
            SocialProfile profile1 = new SocialProfile();
            profile1.setSocialUser(user1);

            SocialProfile profile2 = new SocialProfile();
            profile2.setSocialUser(user2);

            SocialProfile profile3 = new SocialProfile();
            profile3.setSocialUser(user3);

            profileRepository.save(profile1);
            profileRepository.save(profile2);
            profileRepository.save(profile3);
        };
    }

    // Utility method for bidirectional mapping
    private void addUserToGroup(SocialUser user, SocialGroup group) {
        user.getGroups().add(group);
        group.getSocialUsers().add(user);
    }


}
