package com.social.media.repositories;

import com.social.media.models.SocialUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialUserRepo extends JpaRepository<SocialUser,Long> { // Long is for the ID
}
