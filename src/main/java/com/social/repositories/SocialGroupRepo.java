package com.social.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialGroupRepo extends JpaRepository<SocialGroupRepo,Long> { // Long is for the ID
}
