package com.social.repositories;

import com.social.models.SocialProfile;
import com.social.models.SocialUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialUserRepo extends JpaRepository<SocialUser,Long> { // Long is for the ID
}
