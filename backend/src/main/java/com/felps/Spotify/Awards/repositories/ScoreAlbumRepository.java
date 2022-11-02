package com.felps.Spotify.Awards.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felps.Spotify.Awards.entities.ScoreAlbum;
import com.felps.Spotify.Awards.entities.pk.ScoreAlbumPk;

@Repository
public interface ScoreAlbumRepository extends JpaRepository<ScoreAlbum, ScoreAlbumPk>{

}
