package microBlogging;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Menu {
	static Scanner keyboard = new Scanner(System.in);

	private static String currentUser;
	private static String allPosts;
	static ArrayList<Users> listOfUsers = new ArrayList<Users>();

	public Menu(String currentUser, String allPosts) {
		Menu.currentUser = currentUser;
		this.allPosts = allPosts;

	}

	public static void mainMenu() {
		System.out.println("Main Menu");
		System.out.println("1) Create a new user");
		System.out.println("2) Become an existing user");
		System.out.println("3) Create a post as the current user");
		System.out.println("4) Print all posts");

		System.out.println(" What would you like to do?");

	}

	public static void createNewUser() {

		System.out.println("What is your web address to your pic?");
		String web = keyboard.nextLine();
		System.out.println("What would you like your username to be?");
		String choiceOfUsername = keyboard.nextLine();
		System.out.println("What is your name?");
		String name = keyboard.nextLine();
		System.out.println("what is your email address?");
		String emailaddress = keyboard.nextLine();

		Users user = new Users(web, choiceOfUsername, name, emailaddress);

		listOfUsers.add(user);

	}

	public static void existingUser() {
		System.out.println();
		System.out.println("which user do you want to become?");
		Iterator<Users> iter = listOfUsers.iterator();
		while (iter.hasNext()) {
			Users u = (Users) iter.next();
			System.out.println(u.getDescription());
		}

		String nameOfUser = keyboard.next();
		currentUser = nameOfUser;
	}

	public static void postAsCurrentUser() {
		keyboard.skip("\n");
		System.out.println("Have you post before? y/n");
		String pastPost=keyboard.next();
		if (pastPost.equals("y")){
		System.out.println(allPosts);
		}
		
		System.out.println("Please write your post.");
		keyboard.skip("\n");
		String currentEntry = keyboard.nextLine();

		int counter;
		counter = Posts.getnextOrder();

		System.out.println("Would you like to add web Link? (yes/no)");

		String answer = keyboard.nextLine();

		String webLink = "";

		if (answer.equals("yes")) {

			System.out.println("Please enter your web link");
			webLink = keyboard.nextLine();

		} else if (answer.equals("no")) {
			webLink = "none";
		}

		Posts currentPost = new Posts(currentUser, counter, currentEntry, webLink);
		Users all = new Users(currentUser);
		all.add(currentPost);
		allPosts = currentPost.getDescriptionofPosts();
	}
	

	public static void printAllPosts() {
		Users.printAllPosts();

	}

}
