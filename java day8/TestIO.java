/**
 * Created by zemoso on 14/7/17.
 */
import java.io.*;
import java.util.*;

/**
 * Class uses BufferedReader to read an input file
 * @author Srinivas Kotla
 */
class BufferedInputFile {
    // Throw exceptions to console:

    /**
     * Method takes string as input and read the file matching the string and constructs a string
     * similar to the file data.
     * @param fileName - Type string. This is the name of the file to be read
     * @return a string which has the contents of the given file
     * @throws IOException
     */
    public static String read(String fileName) throws IOException {
// Reading input by lines:
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        String s;
        StringBuilder sb = new StringBuilder();
        while((s = in.readLine())!= null)
            sb.append(s + "\n");
        in.close();
        return sb.toString();
    }
}

/**
 * Class to write the output onto a file
 */
class BufferedOutputFile{
    /**
     * Method to write the output on to a file
     * @param fileName - Type string. Name of the file
     * @param count - a HashMap which contains the occurences of each character
     * @throws IOException
     */
    public static void write(String fileName,Map<Character, Integer> count)throws IOException {
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
        List<Character> key = new ArrayList<Character>(count.keySet());
        for (char i : key) {
            out.print(i + "-" + count.get(i) + "\n");
        }

        out.close();

    }
}

public class TestIO{
    public static void main(String [] args)throws IOException {
        //if (args.length == 0) System.exit(0);
        try {
            File path = new File(args[0]);
            if (path.isFile()) {
                StringReader in = new StringReader(BufferedInputFile.read(args[0]));
                Map<Character, Integer> count = new HashMap<Character, Integer>();
                int c;
                while ((c = in.read()) != -1) {
                    char s = (char) c;
                    if (s != '\n') {
                        Integer freq = count.get(s);
                        count.put(s, freq == null ? 1 : freq + 1);
                    }
                }
                String file = "BasicFileOutput";
                BufferedOutputFile.write(file,count);
            } else {
                throw new FileNotFoundException();
            }
        } catch (Exception e){
            //e.printStackTrace();
            System.out.println("Error Messages:..........");
            System.out.println("File does not Exist.");
            System.out.println("Please provide a valid file name");
        }

    }
}
