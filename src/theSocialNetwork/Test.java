package theSocialNetwork;

public class Test {

	public static void main(String[] args) {
		NewsFeed n = new NewsFeed();
		User u = new User("Tom");
		Message m = new Message(u, "Hello");
		m.addMessage(m);
		Message m2 = new Message(u, "Bye");
		m.addMessage(m2);
		
		n.addPost(m);
		n.addPost(m2);
		n.printNewsFeed();
	}
}
