package com.felps.Spotify.Awards.dto;

import com.felps.Spotify.Awards.entities.Artist;

public class ArtistDTO {

	private Long id;
	private String name;
	private String image;
	private String listeners;
	private Double average;
	private Integer countVotes;

	public ArtistDTO() {

	}

	public ArtistDTO(Long id, String name, String image, String listeners, Double average, Integer countVotes) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.listeners = listeners;
		this.average = average;
		this.countVotes = countVotes;
	}

	public ArtistDTO(Artist artist) {
		id = artist.getId();
		name = artist.getName();
		image = artist.getImage();
		listeners = artist.getListeners();
		average = artist.getAverage();
		countVotes = artist.getCountVotes();
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getListeners() {
		return listeners;
	}

	public void setListeners(String listeners) {
		this.listeners = listeners;
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
