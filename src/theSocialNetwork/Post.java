package theSocialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class Post {

	private String autor;
	private String text;
	private LocalDate timestamp;
	private int likes;
	private ArrayList<String> comments;
	
	public Post(String autor, String text, LocalDate timestamp, int likes, ArrayList<String> comments) {
		super();
		this.autor = autor;
		this.text = text;
		this.timestamp = timestamp;
		this.likes = likes;
		this.comments = new ArrayList<String>();
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDate getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public ArrayList<String> getComments() {
		return comments;
	}

	public void setComments(ArrayList<String> comments) {
		this.comments = comments;
	}
	
	
	
}
