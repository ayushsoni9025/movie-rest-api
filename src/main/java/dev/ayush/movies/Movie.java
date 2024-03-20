package dev.ayush.movies;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection="movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie { 
	
	@Id
	private ObjectId _id;
	
	
	private String imdbId;
	private String title;
	private String releaseDate;
	private String trailerLink;
	private String poster;
	private List<String> genres;
	private List<String> backdrops;
	
	@DocumentReference
	private List<Reviews> reviewIds;

	public Movie(ObjectId _id, String imdbId, String title, String releaseDate, String trailerLink, String poster,
			List<String> genres, List<String> backdrops, List<Reviews> reviewIds) {
		super();
		this._id = _id;
		this.imdbId = imdbId;
		this.title = title;
		this.releaseDate = releaseDate;
		this.trailerLink = trailerLink;
		this.poster = poster;
		this.genres = genres;
		this.backdrops = backdrops;
		this.reviewIds = reviewIds;
	}

	public ObjectId get_id() {
		return _id;
	}

	public String getImdbId() {
		return imdbId;
	}

	public String getTitle() {
		return title;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public String getTrailerLink() {
		return trailerLink;
	}

	public String getPoster() {
		return poster;
	}

	public List<String> getGenres() {
		return genres;
	}

	public List<String> getBackdrops() {
		return backdrops;
	}

	public List<Reviews> getReviewIds() {
		return reviewIds;
	}
	
	
	
}
