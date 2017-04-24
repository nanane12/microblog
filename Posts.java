package microBlogging;

public class Posts {
	private static int nextOrder = 1;

	private String user;
	private int order;
	private String contents;
	private String webLink;

	public Posts(String user, int nextOrder, String contents, String webLink) {
		this.user = user;
		this.order = nextOrder;

		this.contents = contents;

		this.webLink = webLink;
	}

	public Posts(String contents) {
		this.contents = contents;
	}

	public String getUser() {
		return user;
	}

	public static int getnextOrder() {
		return nextOrder++;
	}

	public String getContents() {
		return contents;
	}

	public String getDescriptionofPosts() {
		return order + ")" + "\n" + "Username: " + user + "\n" + "Your Post: " + contents + "\n" + "Website: " + webLink
				+ "\n";
	}

}
