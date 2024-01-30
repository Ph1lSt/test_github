package theSocialNetwork;

import java.util.ArrayList;

import geoMetry.Shapes;

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
	
	
}
