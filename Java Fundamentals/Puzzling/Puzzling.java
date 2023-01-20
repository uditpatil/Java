import java.util.ArrayList;
import java.util.Random;

public class Puzzling{
    
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> tenRolls = new ArrayList();
        Random randomTen = new Random();
        for (int i = 0; i <10; i++) {
            tenRolls.add(randomTen.nextInt(20)+1);
        }
        return tenRolls;
    }

    public String getRandomLetter() {
        Random randomLetter = new Random();
        String allAlphabets = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabetArray = new String[26];
        for (int i = 0; i < 26; i++) {
            alphabetArray[i] = String.valueOf(allAlphabets.charAt(i));
        }
        return alphabetArray[randomLetter.nextInt(26)];
    }

    public String genaratePassword() {
        String pass = "";
        for (int i = 0; i < 8; i++) {
            pass = pass + getRandomLetter();
        }
        return pass;
    }

    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> newPassSet = new ArrayList<String>();
        for( int i = 0; i < length; i++) {
            newPassSet.add(genaratePassword());
        }
        return newPassSet;
    }
}