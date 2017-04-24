package microBlogging;

import java.util.ArrayList;
//import java.util.Iterator;

public class Users {

	private String webAddress;
	private String username;
	private String name;
	private String email;
	private static ArrayList<Posts> posts = new ArrayList<Posts>();

	public Users(String webAddress, String username, String name, String email) {

		this.webAddress = webAddress;
		this.username = username;
		this.name = name;
		this.email = email;

	}
public Users(String username)
{
	this.username=username;
}
	public ArrayList getPosts() {
		return posts;
	}

	public String getwebAddress() {
		return webAddress;
	}

	public String getusername() {
		return username;
	}

	public String getname() {
		return name;
	}

	public String getemail() {
		return email;
	}

	public String getDescription() {
		return ("Web address: " + webAddress + "\n" + "Username: " + username + "\n" + "Name: " + name + "\n"
				+ "Email: " + email + "\n");

	}

	public void add(Posts p) {
		posts.add(p);// one to many relationship, user can add a new post to the
						// list
	}

	public static void printAllPosts() {
		for (int count = 0; count < posts.size(); count++) {
			Posts p = (Posts) posts.get(count);

			System.out.println(p.getDescriptionofPosts());
		}
	}
}
