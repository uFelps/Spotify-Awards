package com.felps.Spotify.Awards.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felps.Spotify.Awards.entities.Album;

public interface AlbumRepository extends JpaRepository<Album, Long>{

}
