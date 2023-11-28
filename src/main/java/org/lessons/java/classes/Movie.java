package org.lessons.java.classes;

public class Movie {

	private int id;
	private String title;
	private String director;

	public Movie(int id, String title, String director) {
		setId(id);
		setTitle(title);
		setDirector(director);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {

		this.id = id;
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
