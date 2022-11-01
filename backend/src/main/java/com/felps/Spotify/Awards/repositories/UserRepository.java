package com.felps.Spotify.Awards.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felps.Spotify.Awards.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
