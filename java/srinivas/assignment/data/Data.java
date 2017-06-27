package srinivas.assignment.data;
public class Data{
	int number;
	char letter;

	public void printMembers(){
		System.out.println(this.number); // cannot access objects without 							    reference to a class. Here an object 							    is created but it has no reference to 							    the class. So it cannot access the 							    methods and members of the class.
		System.out.println(this.letter); // Unable to print the object as it 							    has no reference.
	}
	
	public void printlocal(int a, char b){ 
		System.out.println(a); // Similarly if we don't initialise a varible 						  java gives you an error.
		System.out.println(b); // same as above.
	}	
}
