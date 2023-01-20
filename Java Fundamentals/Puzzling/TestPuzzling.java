import java.util.Random;
import java.util.ArrayList;
public class TestPuzzling {
    public static void main(String[] args) {
        Puzzling testPuzzling = new Puzzling();
        System.out.println("Array with 10 random numbers between 1 and 20" + testPuzzling.getTenRolls());
        System.out.println("Random letter from array of all alphabet: " + testPuzzling.getRandomLetter());
        System.out.println("Genarate random string of 8 character password: " + testPuzzling.genaratePassword());
        System.out.println("Generate random String of given length character password: " + testPuzzling.getNewPasswordSet(6));
    }
}