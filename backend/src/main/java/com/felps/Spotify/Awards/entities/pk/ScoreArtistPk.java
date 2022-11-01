package com.felps.Spotify.Awards.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import com.felps.Spotify.Awards.entities.Artist;
import com.felps.Spotify.Awards.entities.User;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ScoreArtistPk implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "artist_id")
	private Artist artist;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public ScoreArtistPk() {

	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		return Objects.hash(artist, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScoreArtistPk other = (ScoreArtistPk) obj;
		return Objects.equals(artist, other.artist) && Objects.equals(user, other.user);
	}


	
}

