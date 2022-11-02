package com.felps.Spotify.Awards.entities;

import java.io.Serializable;

import com.felps.Spotify.Awards.entities.pk.ScoreSongPk;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "score_song")
public class ScoreSong implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private ScoreSongPk id = new ScoreSongPk();
	private Double score;

	public ScoreSong() {

	}

	public ScoreSong(User user, Song song, Double score) {
		id.setUser(user);
		id.setSong(song);
		this.score = score;
	}

	public User getUser() {
		return id.getUser();
	}

	public void setUser(User user) {
		id.setUser(user);
	}

	public Song getSong() {
		return id.getSong();
	}

	public void setSong(Song song) {
		id.setSong(song);
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

}
