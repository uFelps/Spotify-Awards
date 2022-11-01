package com.felps.Spotify.Awards.entities;

import java.io.Serializable;

import com.felps.Spotify.Awards.entities.pk.ScoreArtistPk;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "score_artist")
public class ScoreArtist implements Serializable{
	

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ScoreArtistPk id = new ScoreArtistPk();
	
	private Double scoreValue;
	
	public ScoreArtist() {
		
	}
	
	public ScoreArtist(Artist artist, User user, Double value) {
		id.setArtist(artist);
		id.setUser(user);
		this.scoreValue = value;
	}

	public Artist getArtist() {
		return id.getArtist();
	}
	
	public void setArtist(Artist artist) {
		id.setArtist(artist);
	}
	
	public User getUser() {
		return id.getUser();
	}
	
	public void setUser(User user) {
		id.setUser(user);
	}
	
	public Double getScoreValue() {
		return scoreValue;
	}

	public void setScoreValue(Double value) {
		this.scoreValue = value;
	}
	
	

}
