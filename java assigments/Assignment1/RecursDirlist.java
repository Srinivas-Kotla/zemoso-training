/**
 * Created by zemoso on 14/7/17.
 */

import java.util.regex.*;
import java.io.*;
import java.util.*;
/**
 * Class Contains methods to print the obtained file list in readable format
 */
class PPrint {
    /**
     * Method converts Collection of objects into a String
     * @param c - Collection of objects
     * @return - returns string
     */
    public static String pformat(Collection<?> c) {
        if(c.size() == 0) return "[]";
        StringBuilder result = new StringBuilder("[");
        for(Object elem : c) {
            if(c.size() != 1)
                result.append("\n ");
            result.append(elem);
        }
        if(c.size() != 1)
            result.append("\n");
        result.append("]");
        return result.toString();
    }

    /**
     * Prints the string returned from pformat method
     * @param c - Collection of Objects
     */
    public static void pprint(Collection<?> c) {
        System.out.println(pformat(c));
    }

    /**
     * Prints an array of objects by converting it into a collection and uses pformat method
     * @param c - Array of objects
     */
    public static void pprint(Object[] c) {
        System.out.println(pformat(Arrays.asList(c)));
    }
}

public class RecursDirlist {
    /**
     * Method to return the list of file matches the regex
     * @param dir - Directory where the files exist
     * @param regex - Regular Expression to be matched
     * @return - returns the list of files matched
     */
    public static File[] local(File dir, final String regex) {
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            public boolean accept(File dir, String name) {
                return pattern.matcher(
                        new File(name).getName()).matches();
            }
        });
    }

    /**
     * Overloaded local method if the path is given as a string
     * @param path - path name as a string
     * @param regex - Regular Expression to be matched
     * @return - returns the list of files matched
     */
    public static File[] local(String path, final String regex) { // Overloaded
        return local(new File(path), regex);
    }
    // A two-tuple for returning a pair of objects:

    /**
     * Inner class to create lists which contains all the directories and files
     * implements Iterable
     */
    public static class TreeInfo implements Iterable<File> {
        /**
         * List containing all the file names
         */
        public List<File> files = new ArrayList<File>();
        /**
         * List containing all the directories
         */
        public List<File> dirs = new ArrayList<File>();
        // The default iterable element is the file list:

        /**
         * Method to return iterator for files list
         * @return - returns File list iterator
         */
        public Iterator<File> iterator() {
            return files.iterator();
        }

        /**
         * Adds lists of two Treeinfos
         * @param other - Parameter of the other Treeinfo
         */
        void addAll(TreeInfo other) {
            files.addAll(other.files);
            dirs.addAll(other.dirs);
        }

        /**
         * Converts both the lists into a readable string using pformat method
         * @return - a string of the lists
         */
        public String toString() {
            return "dirs: " + PPrint.pformat(dirs) +
                    "\n\nfiles: " + PPrint.pformat(files);
        }
    }

    /**
     * Method to walk through all the subdirectories and get the filenames
     * @param start - Starting Directory
     * @param regex - Regular Expression to be matched
     * @return - returns the final TreeInfo
     */
    public static TreeInfo walk(String start, String regex) { // Begin recursion
        return recurseDirs(new File(start), regex);
    }

    /**
     * Method to recursively add all the subdirectories and files in it
     * Whenever a directory if found the method is called in itself on the
     * found directory and the returned TreeInfo is added to the previous TreeInfo
     * and so on until it reaches the root
     * @param startDir - Present working directory
     * @param regex - Regular Expression to be matched
     * @return - returns the TreeInfo
     */
    static TreeInfo recurseDirs(File startDir, String regex){
        TreeInfo result = new TreeInfo();
        for(File item : startDir.listFiles()) {
            if(item.isDirectory()) {
                result.dirs.add(item);
                result.addAll(recurseDirs(item, regex));
            } else // Regular file
                if(item.getName().matches(regex))
                    result.files.add(item);
        }
        return result;
    }
    // Simple validation test:
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s="";
        System.out.println("Enter a regular expression to get matched files or \".\" to exit:");
        while(!((s=scan.next()).equals(".")) ){
            System.out.println(walk("/home",s));

            System.out.println("Enter a regular expression to get matched files or \".\" to exit:");
        }
    }
}
