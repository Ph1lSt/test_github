package theSocialNetwork;

public class Test {

	public static void main(String[] args) {
		NewsFeed n = new NewsFeed();
		User u = new User("Tom");
		User u2 = new User("Kowalski");
		Message m = new Message(u, "Hello");
		m.addMessage(m);
		Message m2 = new Message(u, "Bye");
		m.addMessage(m2);
		Photo p = new Photo(u, "My newest picture:", "Picture.png");
		p.addPhoto(p);
		
		n.addPost(m);
		n.addPost(m2);
		n.addPost(p);
		n.printNewsFeed();
//		n.deletePost(m2);
//		n.deletePost(p);
//		n.printNewsFeed();
		n.searchNewsFeed(u2);
		n.searchMessages(u);
	}
}
