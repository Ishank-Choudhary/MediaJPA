package com.social.media.service;

import com.social.media.models.SocialProfile;
import com.social.media.models.SocialUser;
import com.social.media.models.SocialGroup;

import java.util.List;

public interface SocialService {

    //GET methods
    List<SocialUser> getAllSocialUsers();
    List<SocialGroup> getAllSocialGroups();
   // List<SocialPost> getAllPosts();
    List<SocialProfile> getAllProfiles();

    //POST methods
    SocialUser saveUser(SocialUser socialUser);


}
