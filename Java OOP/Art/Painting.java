public class Painting extends Art{

	public String paintType;

	public Painting(String title, String author, String description, String paintType) {
		super(title, author, description);
		this.paintType = paintType;
	}

	public String getPaintType() {
		return paintType;
	}

	public void setPaintType(String paintType) {
		this.paintType = paintType;
	}
	
	public void viewArt() {
		String ArtOnDisplay = "";
		ArtOnDisplay += "Title: " + getTitle() + "\n" + "Author: " + getAuthor() + "\n" + "Description: " + getDescription() + "\n";
	
		System.out.println(ArtOnDisplay);
	}
	
	
}
