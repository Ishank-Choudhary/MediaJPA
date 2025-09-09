package com.social.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SocialPostRepo extends JpaRepository<SocialPostRepo,Long> { // Long is for the ID
}
