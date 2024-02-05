package theSocialNetwork;

import java.time.LocalDate;
import java.util.ArrayList;

public class Message extends Post{

	private String text;
	private ArrayList<Message> messages;
	
	public Message(User author, String text) {
		super();
		this.text = text;
	}

	public Message(int likes, User author, ArrayList<Comment> comments, LocalDate timestamp) {
		super(likes, author, comments, timestamp);
		// TODO Auto-generated constructor stub
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	public ArrayList<Message> getMessages() {
		return messages;
	}

	public void setMessages(ArrayList<Message> messages) {
		this.messages = messages;
	}

	public String toString() {
		String tmp = "Alle Nachrichten: ";
		for(Message m : messages) {
			User author = m.getAuthor();
			String text = m.getText();
			LocalDate timestamp = m.getTimestamp();
			int likes = m.getLikes();
			tmp = tmp + "\n\tVerfasst von: " + author +
					"\n\t" + text +
					"\n\tDatum: " + timestamp +
					" | ❤️" + likes;
		}
		return tmp;
	}
}
