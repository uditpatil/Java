import java.util.ArrayList;
import java.util.Collections;
public class Museum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Art> museum = new ArrayList<Art>();

		museum.add(new Painting("Mona Lisa", "Da Vinci", "Worlds first painting", "canvas"));
		museum.add(new Painting("Mona Kisa", "Da Vinci2", "Worlds 2nd painting", "oil"));
		museum.add(new Painting("Mona Sisa", "Da Vinci3", "Worlds 3rd painting", "abstract"));
		museum.add(new Sculpture("Mona Fisa", "Da Vinci4", "Worlds 1st sculpture", "plaster of paris"));
		museum.add(new Sculpture("Mona Risa", "Da Vinci5", "Worlds 2nd sculpture", "mud"));
		
        Collections.shuffle(museum);
        for(Art artCollection : museum){
            artCollection.viewArt();
        }
	}

}