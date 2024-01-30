package theSocialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class Post {

	private int likes;
	private User author;
	private ArrayList<Comment> comments;
	private LocalDate timestamp;
	private ArrayList<Post> posts;
	
	public Post(int likes, User author, ArrayList<Comment> comments, LocalDate timestamp) {
		super();
		this.likes = likes;
		this.author = author;
		this.comments = new ArrayList<Comment>();
		this.timestamp = timestamp;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public ArrayList<Comment> getComments() {
		return comments;
	}

	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}

	public LocalDate getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}
	
}
