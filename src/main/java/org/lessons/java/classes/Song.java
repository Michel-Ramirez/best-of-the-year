package org.lessons.java.classes;

import java.util.Random;

public class Song {

	private int id;
	private String title;
	private String author;

	public Song(String title, String author) {
		setId();
		setTitle(title);
		setAuthor(author);
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