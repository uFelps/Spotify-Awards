package com.felps.Spotify.Awards.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.felps.Spotify.Awards.dto.AlbumDTO;
import com.felps.Spotify.Awards.entities.Album;
import com.felps.Spotify.Awards.repositories.AlbumRespository;

@Service
public class AlbumService {
	
	@Autowired
	private AlbumRespository repository;
	
	@Transactional(readOnly = true)
	public Page<AlbumDTO> findAll(Pageable pageable){
		Page<Album> albuns = repository.findAll(pageable);
		
		Page<AlbumDTO> albunsDTO = albuns.map(x -> new AlbumDTO(x));
		
		return albunsDTO;
	}
	
	@Transactional
	public AlbumDTO findById(Long id) {
		Album album = repository.findById(id).get();
		
		return new AlbumDTO(album);
	}

}
