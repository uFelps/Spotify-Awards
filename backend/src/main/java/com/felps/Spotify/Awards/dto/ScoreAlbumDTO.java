package com.felps.Spotify.Awards.dto;

public class ScoreAlbumDTO {

	private Long albumId;
	private String email;
	private Double score;

	public ScoreAlbumDTO() {

	}

	public Long getAlbumId() {
		return albumId;
	}

	public void setAlbumId(Long albumId) {
		this.albumId = albumId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

}
