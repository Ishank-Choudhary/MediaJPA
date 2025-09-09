package com.social.controller;

import com.social.models.SocialUser;
import com.social.service.SocialServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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


}
