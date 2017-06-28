public class ConstructMsg{
	ConstructMsg(){
		System.out.println("Hi");
	}
	ConstructMsg(String s){
		System.out.println(s);
	}

	public static void main (String [] args){
		ConstructMsg [] array = new ConstructMsg [5];
		// no initialisation msgs are being printed...Declaring an array of objects does not initialize the array. We need to create instances of the objects to and reference them to the array cells.
	}
}
