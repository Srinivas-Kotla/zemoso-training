import java.util.*;
import java.io.*;
public class CheckLetters{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		Map<Character,Integer> alphabets = new HashMap<Character,Integer>();
		String s = scan.next();
		Integer freq;
		for(char c:s.toCharArray()){
			freq = alphabets.get(c);
			alphabets.put(c,freq==null? 1:freq+1);
		}
		boolean check = true;
		for(int i=97;i<=122;i++){
			if(alphabets.get((char)i)==null){
				check = false;
				break;
			}
		}

		System.out.println(check);
	}
}