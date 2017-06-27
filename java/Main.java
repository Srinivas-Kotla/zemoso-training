package srinivas.assignment.main;
import srinivas.assignment.data.Data;
import srinivas.assignment.singleton.Singleton;
public class Main{
	public static void main(String[] args){
		Data d = new Data();
		int a;
		char b;
		d.printMembers();
		//d.printLocal(a,b); ...This method is not possible as the local variables are not 						initialized or they don't get any default initialization. int 						and char objects are created but they don't have any reference 						to the class.s 

/* The class members get default initialisation because when ever we call the new keyword then the class gets loaded with the member variables get initialsied by the constructers else they will get default values */

		String s = "Hello";
		Singleton string = Singleton.set(s);
		string.print();		
	}
}
