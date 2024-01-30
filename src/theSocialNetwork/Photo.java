package theSocialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class Photo {

	private String Author;
	private String pictureFileName;
	private String headline;
	private LocalDate timestamp;
	private int likes;
	private ArrayList<Comment> comments;
	
	public Photo(String author, String pictureFileName, String headline, LocalDate timestamp, int likes,
			ArrayList<Comment> comments) {
		super();
		Author = author;
		this.pictureFileName = pictureFileName;
		this.headline = headline;
		this.timestamp = timestamp;
		this.likes = likes;
		this.comments = new ArrayList<Comment>();
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getPictureFileName() {
		return pictureFileName;
	}

	public void setPictureFileName(String pictureFileName) {
		this.pictureFileName = pictureFileName;
	}

	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
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

	public ArrayList<Comment> getComments() {
		return comments;
	}

	public void setComments(ArrayList<Comment> comments) {
		this.comments = comments;
	}
	
}
