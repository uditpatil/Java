import java.util.HashMap;
import java.util.Set;
public class Tracks {
    public static void main (String[] args) {
        //creating Hash Map trackList with 4 title and their lyrics in it.
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Nirvana - Pennyroyal Tea", "Give me a Leonard Cohen afterworld, So I can sigh eternally.");
        trackList.put("The Smiths - This Charming Man", "Punctured bicycle... on a hillside desolate, Will nature make a man of me yet?");
        trackList.put("The Beatles - The End", "And in the end, The love you take,  Is equal to the love you make");
        trackList.put("The Stone Roses - I Wanna Be Adored", "I don’t have to sell my soul, He’s already in me.");
        
        //Getting single song title lyrics by it's title name (getting value of a key in hashmap)
        System.out.println("\n----- Get Song Lyric -----\n");
        System.out.println(trackList.get("The Beatles - The End"));

        //Looping through all key value pairs, and printing them in format of key:value.
        System.out.println("\n----- Print track names and lyrics -----\n");
        Set<String> titles = trackList.keySet();
        for(String title : titles) {
            System.out.println(title + " : " + trackList.get(title));
        }
    }
}