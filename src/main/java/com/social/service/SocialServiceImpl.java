package com.social.service;


import com.social.models.SocialUser;
import com.social.repositories.SocialGroupRepo;
import com.social.repositories.SocialPostRepo;
import com.social.repositories.SocialProfileRepo;
import com.social.repositories.SocialUserRepo;
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
        List<SocialUser> socialUsers = socialUserRepo.findAll();
    }
}
