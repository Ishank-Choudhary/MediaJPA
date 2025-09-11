package com.social.media.repositories;

import com.social.media.models.SocialGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialGroupRepo extends JpaRepository<SocialGroup,Long> { // Long is for the ID
}
