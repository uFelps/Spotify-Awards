package com.felps.Spotify.Awards.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felps.Spotify.Awards.dto.AlbumDTO;
import com.felps.Spotify.Awards.dto.AlbumSimpleDTO;
import com.felps.Spotify.Awards.entities.Album;
import com.felps.Spotify.Awards.repositories.AlbumRepository;

@Service
public class AlbumService {
	
	@Autowired
	private AlbumRepository repository;
	
	@Transactional(readOnly = true)
	public Page<AlbumSimpleDTO> findAll(Pageable pageable){
		Page<Album> albuns = repository.findAllByOrderByIdAsc(pageable);
		
		Page<AlbumSimpleDTO> albunsSimpleDTO = albuns.map(x -> new AlbumSimpleDTO(x));
		
		return albunsSimpleDTO;
	}
	
	@Transactional
	public AlbumDTO findById(Long id) {
		Album album = repository.findById(id).get();
		
		return new AlbumDTO(album);
	}

}
