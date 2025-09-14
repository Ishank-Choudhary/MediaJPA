package com.social.media.controller;

import com.social.media.models.SocialGroup;
import com.social.media.models.SocialProfile;
import com.social.media.models.SocialUser;
import com.social.media.service.SocialServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SocialController {
    @Autowired
    private SocialServiceImpl socialService;

    @GetMapping("/socialUsers/")
    public ResponseEntity<List<SocialUser>> getSocialUser(){
        return new ResponseEntity<>(socialService.getAllSocialUsers(), HttpStatus.OK);
    }

    @GetMapping("/socialGroups/")
    public ResponseEntity<List<SocialGroup>> getSocialGroup(){
        return new ResponseEntity<>(socialService.getAllSocialGroups(),HttpStatus.OK);
    }

    @GetMapping("/socialProfile/")
    public ResponseEntity<List<SocialProfile>> getSocialProfile(){
        return new ResponseEntity<>(socialService.getAllProfiles(),HttpStatus.OK);
    }

    @PostMapping("/create/socialUsers/")
    public ResponseEntity<SocialUser> saveUser(@RequestBody SocialUser socialUser){
        return new ResponseEntity<>(socialService.saveUser(socialUser),HttpStatus.CREATED);
    }


}
