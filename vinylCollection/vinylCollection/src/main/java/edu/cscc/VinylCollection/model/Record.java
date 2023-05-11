package edu.cscc.VinylCollection.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
public class Record {
	public Record() {}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;
	
	@NotEmpty(message="Please enter a title")
	@Size(max=50, message="May not be larger than 50 characters")
	public String title;
	
	@NotEmpty(message="Please enter an album")
	@Size(max=40, message="May not be larger than 40 characters")
	public String artist;
	
	@NotEmpty(message="Please enter a label")
	@Size(max=40, message="May not be larger than 40 characters")
	public String label;
	
	@Min(value=1930, message="Must have been released on or after 1930")
	public int releaseyear;
	
	@Min(value=1, message="Must be at least 1")
	@Max(value=20, message="Must be less than 20")
	public int tracks;
	
	
	public String size;
	
	
	public boolean damaged;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getReleaseyear() {
		return releaseyear;
	}

	public void setReleaseyear(int releaseyear) {
		this.releaseyear = releaseyear;
	}

	public int getTracks() {
		return tracks;
	}

	public void setTracks(int tracks) {
		this.tracks = tracks;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public boolean isDamaged() {
		return damaged;
	}

	public void setDamaged(boolean damaged) {
		this.damaged = damaged;
	}
}
