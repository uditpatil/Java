public abstract class Art {

	public String title;
	public String author;
	public String description;
	
	public abstract void viewArt();

	public Art(String title, String author, String description) {
		super();
		this.title = title;
		this.author = author;
		this.description = description;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}