package org.lessons.java.controller;

import java.util.ArrayList;
import java.util.List;

import org.lessons.java.classes.Movie;
import org.lessons.java.classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MainController {

	@GetMapping("/")
	public String best1(Model model) {

		String name = "Michel Ramirez";

		model.addAttribute("name", name);
		return "index-name";
	}

	private List<Movie> getBestMovies() {

		List<Movie> movies = new ArrayList<>();

		movies.add(new Movie("Inception", "Christopher Nolan"));
		movies.add(new Movie("La La Land", "Damien Chazelle"));
		movies.add(new Movie("The Shawshank Redemption", "Frank Darabont"));
		movies.add(new Movie("The Dark Knight", "Christopher Nolan"));
		movies.add(new Movie("Pulp Fiction", "Quentin Tarantino"));
		movies.add(new Movie("Forrest Gump", "Robert Zemeckis"));
		movies.add(new Movie("Interstellar", "Christopher Nolan"));
		movies.add(new Movie("The Godfather", "Francis Ford Coppola"));
		movies.add(new Movie("The Matrix", "Lana Wachowski, Lilly Wachowski"));
		movies.add(new Movie("Fight Club", "David Fincher"));

		return movies;

	}

	private List<Song> getBestSongs() {

		List<Song> songs = new ArrayList<>();

		songs.add(new Song("Bohemian Rhapsody", "Queen"));
		songs.add(new Song("Imagine", "John Lennon"));
		songs.add(new Song("Hotel California", "Eagles"));
		songs.add(new Song("Smells Like Teen Spirit", "Nirvana"));
		songs.add(new Song("Billie Jean", "Michael Jackson"));
		songs.add(new Song("Hey Jude", "The Beatles"));
		songs.add(new Song("Stairway to Heaven", "Led Zeppelin"));
		songs.add(new Song("Like a Rolling Stone", "Bob Dylan"));
		songs.add(new Song("Yesterday", "The Beatles"));
		songs.add(new Song("Wonderwall", "Oasis"));

		return songs;
	}

	@GetMapping("/movies")
	public String bestMovies(Model model) {

		List<Movie> movieList = getBestMovies();

		model.addAttribute("movies", movieList);

		return "index-best-movies";

	}

	@GetMapping("/songs")
	public String bestSong(Model model) {

		List<Song> songList = getBestSongs();

		model.addAttribute("songs", songList);
		return "index-best-songs";

	}

	@GetMapping("/movies/{id}")
	public String detailMovie(Model model, @PathVariable int id) {

		int intId = Integer.valueOf(id);

		List<Movie> movieList = getBestMovies();

		String movieTitle = null;
		for (Movie movie : movieList) {

			if (movie.getId() == intId) {

				movieTitle = movie.getTitle();
			}
		}

		model.addAttribute("movietitle", movieTitle);

		return "index-detail-movie";

	}

	@GetMapping("/songs/{id}")
	public String detailSong(Model model, @PathVariable int id) {

		int intId = Integer.valueOf(id);

		List<Song> songList = getBestSongs();

		String songTitle = null;
		for (Song song : songList) {

			if (song.getId() == intId) {

				songTitle = song.getTitle();
			}
		}

		model.addAttribute("songtitle", songTitle);

		return "index-detail-song";

	}

}
