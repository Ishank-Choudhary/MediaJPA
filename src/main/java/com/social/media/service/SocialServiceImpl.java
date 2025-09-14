package com.social.media.service;


import com.social.media.models.SocialGroup;
import com.social.media.models.SocialProfile;
import com.social.media.models.SocialUser;
import com.social.media.repositories.SocialGroupRepo;
import com.social.media.repositories.SocialPostRepo;
import com.social.media.repositories.SocialProfileRepo;
import com.social.media.repositories.SocialUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SocialServiceImpl implements SocialService{

    @Autowired
    public SocialUserRepo socialUserRepo;
    @Autowired
    public SocialPostRepo socialPostRepo;
    @Autowired
    public SocialGroupRepo socialGroupRepo;
    @Autowired
    public SocialProfileRepo socialProfileRepo;

    @Override
    public List<SocialUser> getAllSocialUsers() {
        return socialUserRepo.findAll();
    }

    @Override
    public List<SocialGroup> getAllSocialGroups() {
        return socialGroupRepo.findAll();
    }

    @Override
    public List<SocialProfile> getAllProfiles() {
        return socialProfileRepo.findAll();
    }

    @Override
    public SocialUser saveUser(SocialUser socialUser) {
        return socialUserRepo.save(socialUser);
    }

}
