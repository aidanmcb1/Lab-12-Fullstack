package edu.cscc.VinylCollection.model;

public class NewRecord {
	public String title;
	public String artist;
	public String label;
	public int releaseyear;
	public int tracks;
	public String size;
	public boolean damaged;
	
	public void newRecord(String title, String artist, String label,
			int releaseyear, int tracks, String size, boolean damaged) {
		this.title = title;
		this.artist = artist;
		this.label = label;
		this.releaseyear = releaseyear;
		this.tracks = tracks;
		this.size = size;
		this.damaged = damaged;
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