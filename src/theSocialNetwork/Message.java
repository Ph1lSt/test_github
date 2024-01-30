package theSocialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class Message extends Post{

	private String text;

	public Message(int likes, User author, ArrayList<Comment> comments, LocalDate timestamp) {
		super(likes, author, comments, timestamp);

	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
}
