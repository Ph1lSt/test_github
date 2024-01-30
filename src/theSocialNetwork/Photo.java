package theSocialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class Photo extends Post{

	private String pictureFileName;
	private String headline;
	
	public Photo(int likes, User author, ArrayList<Comment> comments, LocalDate timestamp) {
		super(likes, author, comments, timestamp);
		// TODO Auto-generated constructor stub
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
	
	
}
