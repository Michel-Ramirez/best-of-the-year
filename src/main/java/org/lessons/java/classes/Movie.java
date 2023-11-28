package org.lessons.java.classes;

import java.util.Random;

public class Movie {

	private int id;
	private String title;
	private String director;

	public Movie(String title, String director) {
		setId();
		setTitle(title);
		setDirector(director);
	}

	public int getId() {
		return id;
	}

	public void setId() {
		Random rnd = new Random();
		int rdnId = rnd.nextInt(1, 11);

		this.id = rdnId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {

		return "id: " + getId() + "\n" + "title: " + getTitle() + "\n" + "Direttore: " + getDirector();
	}

}
