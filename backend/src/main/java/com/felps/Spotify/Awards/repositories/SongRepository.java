package com.felps.Spotify.Awards.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felps.Spotify.Awards.entities.Song;

public interface SongRepository extends JpaRepository<Song, Long>{

}
