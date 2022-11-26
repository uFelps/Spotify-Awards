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
@Table(name = "tb_song")
public class Song implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String artist;
	private String duration;
	private String category;
	private Boolean indicatedBestSong;
	private Boolean indicatedBestCategory;
	private String url;
	private String img;
	private Double average;
	private Integer countVotes;
	
	
	@OneToMany(mappedBy = "id.song")
	private Set<ScoreSong> scores = new HashSet<>();
	
	public Song() {
		
	}

	public Song(Long id, String title, String artist, String duration, String category, Boolean indicatedBestSong,
			Boolean indicatedBestCategory, String url, String img, Double average, Integer countVotes) {
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.duration = duration;
		this.category = category;
		this.indicatedBestSong = indicatedBestSong;
		this.indicatedBestCategory = indicatedBestCategory;
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Boolean getIndicatedBestSong() {
		return indicatedBestSong;
	}

	public void setIndicatedBestSong(Boolean indicatedBestSong) {
		this.indicatedBestSong = indicatedBestSong;
	}

	public Boolean getIndicatedBestCategory() {
		return indicatedBestCategory;
	}

	public void setIndicatedBestCategory(Boolean indicatedBestCategory) {
		this.indicatedBestCategory = indicatedBestCategory;
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
	
	


	public Set<ScoreSong> getScores() {
		return scores;
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
		Song other = (Song) obj;
		return Objects.equals(id, other.id);
	}
	
	
	

}
