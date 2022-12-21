package com.felps.Spotify.Awards.repositories;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.felps.Spotify.Awards.entities.Song;

public interface SongRepository extends JpaRepository<Song, Long>{

	Page<Song> findAllByIndicatedBestSongOrderByIdAsc(boolean indicated, Pageable pageable);
	
	@Query("SELECT obj FROM Song obj WHERE obj.category = :category AND obj.indicatedBestCategory = true ORDER BY obj.id ASC")
	Page<Song> findByCategoryOrderByIdAsc(String category, Pageable pageable);
}
