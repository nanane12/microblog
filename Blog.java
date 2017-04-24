package microBlogging;

import java.util.Scanner;

public class Blog {
	static Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {
		char quit = 'n';

		while (quit != 'y') {
			Menu.mainMenu();
			int choice = keyboard.nextInt();
			switch (choice) {
			case 1: {
				Menu.createNewUser();
				break;
			}
			case 2: {
				Menu.existingUser();

				break;
			}
			case 3: {

				Menu.postAsCurrentUser();
				break;
			}
			case 4: {
				Menu.printAllPosts();
				break;
			}
			}
			System.out.println();
			System.out.println("Would you like to quit y/n?");
			String answer = keyboard.next();
			quit = answer.charAt(
					0);/*
						 * Get the character at position 0 in the string called
						 * answer, then store it in the quit variable".
						 */
		}

		/*
		 * Posts[] post=new Posts[5]; post[0]= new Posts("user1",1, "contents",
		 * true); post[1]=new Posts("user2", 2, "contents2", false); post[2]=new
		 * Posts("user3", 3, "contents3", true); post[3]=new Posts("user4", 4,
		 * "contents4", false); post[4]=new Posts("user5", 5, "contents5",
		 * true);
		 * 
		 * Users[] user=new Users[3]; user[0]=new Users("webaddress", "nanane",
		 * "nanane mc", "nanane@aol"); user[1]=new Users("http://1", "et",
		 * "E.T", "et@hotmail.com"); user[2]=new Users("http;//2", "peppapig",
		 * "peppa", "p@gmail.com");
		 * 
		 * 
		 * for (int count=0; count<post.length; count++) {
		 * System.out.println(post[count].getDescriptionofposts()); } for (int
		 * counter=0; counter<user.length; counter++) {
		 * System.out.println(user[counter].getDescription()); }
		 */

	}
}
