import java.io.*;
import java.util.*;

class BufferedInputFile {
// Throw exceptions to console:
	public static String read(String filename) throws IOException {
// Reading input by lines:
	BufferedReader in = new BufferedReader(new FileReader(filename));
	String s;
	StringBuilder sb = new StringBuilder();
	while((s = in.readLine())!= null)
	sb.append(s + "\n");
	in.close();
	return sb.toString();
	}
}
public class TestIO{
	public static void main(String [] args)throws IOException{
	//if(args.length == 0) System.exit(0);

	StringReader in = new StringReader(BufferedInputFile.read(args[0]));
	Map<Character,Integer> count = new HashMap<Character,Integer>();
	int c;
	while((c=in.read()) != -1){
		char s = (char)c;
		if(s != '\n'){
		Integer freq = count.get(s);
		count.put(s,freq == null ? 1:freq+1);
		}	
	}
	String file = "BasicFileOutput";
	PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
	List<Character> key = new ArrayList<Character>(count.keySet());
	for(char i: key){
		out.print(i+"-"+count.get(i)+"\n");
	}

	out.close();

	}
}