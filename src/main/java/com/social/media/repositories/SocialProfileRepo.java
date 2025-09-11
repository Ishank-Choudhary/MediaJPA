package com.social.media.repositories;

import com.social.media.models.SocialProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialProfileRepo extends JpaRepository<SocialProfile,Long> { // Long is for the ID
}
