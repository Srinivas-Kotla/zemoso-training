import java.util.regex.*;
import java.lang.Character;

public class TestPattern{
		public static void main(String [] args){
			Pattern p = Pattern.compile("^[A-Z].*\\x2E$");
			Matcher m = p.matcher("This is a new line.");
			boolean b = m.matches();
			//System.out.println("This is a new line.".matches("^[A-Z].*\\x2E$"));
			System.out.println(b);
		}
}