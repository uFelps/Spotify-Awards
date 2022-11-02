package com.felps.Spotify.Awards.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import com.felps.Spotify.Awards.entities.Album;
import com.felps.Spotify.Awards.entities.User;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ScoreAlbumPk implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "album_id")
	private Album album;

	public ScoreAlbumPk() {

	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	@Override
	public int hashCode() {
		return Objects.hash(album, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScoreAlbumPk other = (ScoreAlbumPk) obj;
		return Objects.equals(album, other.album) && Objects.equals(user, other.user);
	}

}
