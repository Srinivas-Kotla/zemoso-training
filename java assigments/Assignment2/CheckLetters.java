/**
 * Created by zemoso on 14/7/17.
 */
import java.util.*;
import java.lang.*;

/**
 * Class to check if a string all alphabets from a to z (case-insensitive)
 */
public class CheckLetters {
    /**
     * Method takes string as an input and returns the boolean true if string has all letters
     * @param s - The string to be checked
     * @return - Returns all the checked value
     */
    public static boolean checker(String s){
        boolean check = false;
        Set<Character> alphabets = new HashSet<Character>();
        for(char c:s.toCharArray()){
            c = Character.toLowerCase(c);
            if((int)c>=97 && (int)c <= 122){
                alphabets.add(c);
            }
        }
        if(alphabets.size()==26)
            check = true;
        return check;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println(checker(s));

    }
}
