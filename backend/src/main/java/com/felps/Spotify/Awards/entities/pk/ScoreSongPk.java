package com.felps.Spotify.Awards.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import com.felps.Spotify.Awards.entities.Song;
import com.felps.Spotify.Awards.entities.User;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class ScoreSongPk implements Serializable{

	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne
	@JoinColumn(name = "song_id")
	private Song song;

	public ScoreSongPk() {

	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}

	@Override
	public int hashCode() {
		return Objects.hash(song, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScoreSongPk other = (ScoreSongPk) obj;
		return Objects.equals(song, other.song) && Objects.equals(user, other.user);
	}

}
