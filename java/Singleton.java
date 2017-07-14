/**
 * Created by zemoso on 14/7/17.
 */
package srinivas.assignment.singleton;

/**
 * Class Singleton to see the implementation of Single object creation
 *
 * @author Srinivas Kotla
 */
 public class Singleton {
    /**
     * Static instance of the class the itself
     */
    private static Singleton instance = new Singleton();
    /**
     * String field of the class
     */
    String s;
    /**
     * Private constructor to hide the constructor for creation of objects;
     */
    private Singleton() {}

    /**
     * Static method for returning the instance of the class
     * @param a
     * @return Instance of the class
     */
    public static Singleton getInstance(String a){
        instance.s = a;
        return instance;
    }

    /**
     * public method to print the string field of the class
     */
    public void print(){
        System.out.println(this.s);
    }
}

