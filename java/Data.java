/**
 * Created by zemoso on 14/7/17.
 */
package srinivas.assignment.data;
/**
 * Class Data defined to test initialisation of variables
 * across classes and methods
 * @author Srinivas Kotla
 */
public class Data{
    /**
     * Instance field1 integer for testing
     */
    int number;
    /**
     * Instance field2 character for testing
     */
    char letter;

    /**
     * Method printMembers used to check whether a class
     * initialises it's member variables in default
     */
    public void printMembers(){
        System.out.println(this.number); // cannot access objects without 							    reference to a class. Here an object 							    is created but it has no reference to 							    the class. So it cannot access the 							    methods and members of the class.
        System.out.println(this.letter); // Unable to print the object as it 							    has no reference.
    }

    /**
     *This method tests whether uninitialised inputs gets initialised while passing
     * to methods
     * @param a - Local integer as input without initialisation
     * @param b - Local integer as input without initialisation
     */

    public void printLocal(int a, char b){
        System.out.println(a); // Similarly if we don't initialise a varible 						  java gives you an error.
        System.out.println(b); // same as above.
    }
}
