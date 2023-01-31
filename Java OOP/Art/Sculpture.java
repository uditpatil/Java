
public class Sculpture extends Art {

	public String material;

	public Sculpture(String title, String author, String description, String material) {
		super(title, author, description);
		this.material = material;
	}
	
	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void viewArt() {
		String ArtOnDisplay = "";
		ArtOnDisplay += "Title: " + getTitle() + "\n" + "Author: " + getAuthor() + "\n" + "Description: " + getDescription() + "\n";
		
		System.out.println(ArtOnDisplay);
	}

}