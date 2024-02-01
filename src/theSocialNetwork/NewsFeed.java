package theSocialNetwork;

import java.util.ArrayList;

public class NewsFeed {

	private ArrayList<Post> posts;

	public NewsFeed(ArrayList<Post> posts) {
		super();
		this.posts = posts;
	}

	public ArrayList<Post> getPosts() {
		return posts;
	}

	public void setPosts(ArrayList<Post> posts) {
		this.posts = posts;
	}
	
	public void addPosts(Post p) {
		posts.add(p);
	}


	public void printNewsFeed() {
		for(Post p : posts) {
			if (p instanceof Message) {
                p.toString();
            } else if (p instanceof Photo) {
                p.toString();
            } else {
                System.err.println("Unbekannter Post-Typ.");
            }
		}
	}
	
	
	
	
}
