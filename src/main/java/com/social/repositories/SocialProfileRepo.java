package com.social.repositories;

import com.social.models.SocialProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialProfileRepo extends JpaRepository<SocialProfile,Long> { // Long is for the ID
}
