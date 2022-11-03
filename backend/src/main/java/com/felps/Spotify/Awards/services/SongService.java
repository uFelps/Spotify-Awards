package com.felps.Spotify.Awards.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.felps.Spotify.Awards.dto.SongDTO;
import com.felps.Spotify.Awards.entities.Song;
import com.felps.Spotify.Awards.repositories.SongRepository;

@Service
public class SongService {

	@Autowired
	private SongRepository repository;

	public Page<SongDTO> findSongsOfTheYear(Pageable pageable) {
		Page<Song> songs = repository.findAllByIndicatedBestSong(true, pageable);

		Page<SongDTO> songsDTO = songs.map(x -> new SongDTO(x));

		return songsDTO;

	}

	public Page<SongDTO> findByCategory(String category, Pageable pageable) {
		Page<Song> songs = repository.findByCategory(category, pageable);

		Page<SongDTO> songsDTO = songs.map(x -> new SongDTO(x));

		return songsDTO;
	}
}
