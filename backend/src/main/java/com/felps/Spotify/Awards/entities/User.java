package com.felps.Spotify.Awards.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;

	@OneToMany(mappedBy = "id.user")
	private Set<ScoreArtist> scoresArtist = new HashSet<>();

	@OneToMany(mappedBy = "id.user")
	private Set<ScoreAlbum> scoresAlbum = new HashSet<>();

	@OneToMany(mappedBy = "id.user")
	private Set<ScoreSong> scoresSong = new HashSet<>();

	public User() {

	}

	public User(Long id, String email) {
		this.id = id;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<ScoreArtist> getScoresArtist() {
		return scoresArtist;
	}

	public Set<ScoreAlbum> getScoresAlbum() {
		return scoresAlbum;
	}

	public Set<ScoreSong> getScoresSong() {
		return scoresSong;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}

}
