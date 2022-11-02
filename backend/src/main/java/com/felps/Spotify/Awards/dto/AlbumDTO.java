package com.felps.Spotify.Awards.dto;

import java.time.Instant;

import com.felps.Spotify.Awards.entities.Album;

public class AlbumDTO {
	
	private Long id;
	private String name;
	private String artist;
	private String duration;
	private Instant released;
	private String url;
	private String img;
	private Double average;
	private Integer countVotes;
	
	public AlbumDTO() {
		
	}

	public AlbumDTO(Long id, String name, String artist, String duration, Instant released, String url, String img,
			Double average, Integer countVotes) {
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.duration = duration;
		this.released = released;
		this.url = url;
		this.img = img;
		this.average = average;
		this.countVotes = countVotes;
	}
	
	public AlbumDTO(Album album) {
		id = album.getId();
		name = album.getName();
		artist = album.getArtist();
		duration = album.getDuration();
		released = album.getReleased();
		url = album.getUrl();
		img = album.getImg();
		average = album.getAverage();
		countVotes = album.getCountVotes();
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

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public Instant getReleased() {
		return released;
	}

	public void setReleased(Instant released) {
		this.released = released;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public Double getAverage() {
		return average;
	}

	public void setAverage(Double average) {
		this.average = average;
	}

	public Integer getCountVotes() {
		return countVotes;
	}

	public void setCountVotes(Integer countVotes) {
		this.countVotes = countVotes;
	}
	
	
	
	

}
