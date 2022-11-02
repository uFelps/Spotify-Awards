package com.felps.Spotify.Awards.entities;

import java.io.Serializable;

import com.felps.Spotify.Awards.entities.pk.ScoreAlbumPk;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "score_album")
public class ScoreAlbum implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ScoreAlbumPk id = new ScoreAlbumPk();
	
	private Double scoreValue;
	
	public ScoreAlbum() {
		
	}
	
	public ScoreAlbum(User user, Album album, Double scoreValue) {
		id.setUser(user);
		id.setAlbum(album);
		this.scoreValue = scoreValue;
	}

	public User getUser() {
		return id.getUser();
	}
	
	public void setUser(User user) {
		id.setUser(user);
	}
	
	public Album getAlbum() {
		return id.getAlbum();
	}
	
	public void setAlbum(Album album) {
		id.setAlbum(album);
	}
	
	public Double getScoreValue() {
		return scoreValue;
	}

	public void setScoreValue(Double scoreValue) {
		this.scoreValue = scoreValue;
	}
	
	

}
