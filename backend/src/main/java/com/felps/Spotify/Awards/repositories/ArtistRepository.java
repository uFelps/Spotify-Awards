package com.felps.Spotify.Awards.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felps.Spotify.Awards.entities.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Long>{

}
