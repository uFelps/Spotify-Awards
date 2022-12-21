package com.felps.Spotify.Awards.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.felps.Spotify.Awards.entities.Album;

public interface AlbumRepository extends JpaRepository<Album, Long>{
	public Page<Album> findAllByOrderByIdAsc(Pageable pageable);

}
