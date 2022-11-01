package com.felps.Spotify.Awards.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felps.Spotify.Awards.entities.ScoreArtist;
import com.felps.Spotify.Awards.entities.pk.ScoreArtistPk;

public interface ScoreArtistRepository extends JpaRepository<ScoreArtist, ScoreArtistPk>{

}
