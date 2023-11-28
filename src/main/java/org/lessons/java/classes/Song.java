package org.lessons.java.classes;

public class Song {

	private int id;
	private String title;
	private String author;

	public Song(int id, String title, String author) {
		setId(id);
		setTitle(title);
		setAuthor(author);
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {

		return "id: " + getId() + "\n" + "title: " + getTitle() + "\n" + "autore: " + getAuthor();
	}

}