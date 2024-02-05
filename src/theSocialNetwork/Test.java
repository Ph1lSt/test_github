package theSocialNetwork;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		NewsFeed n = new NewsFeed();
		User u = new User("Tom");
		Message m = new Message(u, "Hello");
		
		n.addPost(m);
		n.printNewsFeed();
	}
}
