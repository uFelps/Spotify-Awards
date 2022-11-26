package com.felps.Spotify.Awards.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_album")
public class Album implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String artist;
	private String duration;
	private Instant released;
	private String url;
	private String img;
	private Double average;
	private Integer countVotes;
	private List<String> songs = new ArrayList<>();

	@OneToMany(mappedBy = "id.album")
	private Set<ScoreAlbum> scoresAlbum = new HashSet<>();

	public Album() {

	}

	public Album(Long id, String name, String artist, String duration, Instant released, String url, String img,
			Double average, Integer countVotes) {
		this.id = id;
		this.name = name;
		this.artist = artist;
		this.duration = duration;
		this.released = released;
		this.url = url;
		this.img = img;
		this.average = average;
		this.countVotes = countVotes;
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

	public Instant getReleased() {
		return released;
	}

	public void setReleased(Instant released) {
		this.released = released;
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

	public List<String> getSongs() {
		return songs;
	}

	@JsonIgnore
	public Set<ScoreAlbum> getScoresAlbum() {
		return scoresAlbum;
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
		Album other = (Album) obj;
		return Objects.equals(id, other.id);
	}

}
