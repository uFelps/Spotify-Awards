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
@Table(name = "tb_artist")
public class Artist implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String image;
	private String listeners;
	private Double average;
	private Integer countVotes;

	@OneToMany(mappedBy = "id.artist")
	private Set<ScoreArtist> scoresArtist = new HashSet<>();

	public Artist() {

	}

	public Artist(Long id, String name, String image, String listeners, Double scoreAvg, Integer countScore) {
		this.id = id;
		this.name = name;
		this.image = image;
		this.listeners = listeners;
		this.average = scoreAvg;
		this.countVotes = countScore;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getListeners() {
		return listeners;
	}

	public void setListeners(String listeners) {
		this.listeners = listeners;
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

	public Set<ScoreArtist> getScoresArtist() {
		return scoresArtist;
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
		Artist other = (Artist) obj;
		return Objects.equals(id, other.id);
	}

}
