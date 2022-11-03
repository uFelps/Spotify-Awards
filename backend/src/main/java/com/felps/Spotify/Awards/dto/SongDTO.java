package com.felps.Spotify.Awards.dto;

import com.felps.Spotify.Awards.entities.Song;

public class SongDTO {

	private Long id;
	private String title;
	private String artist;
	private String duration;
	private String category;
	private Boolean indicatedBestSong;
	private Boolean indicatedBestCategory;
	private String url;
	private String img;
	private Double average;
	private Integer countVotes;

	public SongDTO(Long id, String title, String artist, String duration, String category, Boolean indicatedBestSong,
			Boolean indicatedBestCategory, String url, String img, Double average, Integer countVotes) {
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.duration = duration;
		this.category = category;
		this.indicatedBestSong = indicatedBestSong;
		this.indicatedBestCategory = indicatedBestCategory;
		this.url = url;
		this.img = img;
		this.average = average;
		this.countVotes = countVotes;
	}

	public SongDTO(Song song) {
		this.id = song.getId();
		this.title = song.getTitle();
		this.artist = song.getArtist();
		this.duration = song.getDuration();
		this.category = song.getCategory();
		this.indicatedBestSong = song.getIndicatedBestSong();
		this.indicatedBestCategory = song.getIndicatedBestCategory();
		this.url = song.getUrl();
		this.img = song.getImg();
		this.average = song.getAverage();
		this.countVotes = song.getCountVotes();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Boolean getIndicatedBestSong() {
		return indicatedBestSong;
	}

	public void setIndicatedBestSong(Boolean indicatedBestSong) {
		this.indicatedBestSong = indicatedBestSong;
	}

	public Boolean getIndicatedBestCategory() {
		return indicatedBestCategory;
	}

	public void setIndicatedBestCategory(Boolean indicatedBestCategory) {
		this.indicatedBestCategory = indicatedBestCategory;
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
