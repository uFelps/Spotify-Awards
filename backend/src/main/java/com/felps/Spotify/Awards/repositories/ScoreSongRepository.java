package com.felps.Spotify.Awards.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felps.Spotify.Awards.entities.ScoreSong;
import com.felps.Spotify.Awards.entities.pk.ScoreSongPk;

public interface ScoreSongRepository extends JpaRepository<ScoreSong, ScoreSongPk>{

}
