package com.felps.Spotify.Awards.dto;

import com.felps.Spotify.Awards.entities.Album;

public class AlbumSimpleDTO {

	private Long id;
	private String name;
	private String artist;
	private String img;

	public AlbumSimpleDTO() {

	}

	public AlbumSimpleDTO(Long id, String name, String artist, String img) {
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.img = img;
	}

	public AlbumSimpleDTO(Album album) {
		this.id = album.getId();
		this.name = album.getName();
		this.artist = album.getArtist();
		this.img = album.getImg();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

}
