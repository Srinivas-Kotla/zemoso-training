public class ConstructMsgs{
	ConstructMsgs(String s){
		System.out.println(s);
	}

	public static void main (String [] args){
		ConstructMsgs [] array = new ConstructMsgs [5];
		for(int i=0;i<array.length;i++){
			array[i] = new ConstructMsgs ("Hello");
	// Here each array cell is getting an new instance of the object. So they get initialsed and the messages get printed.
		}
	}
}
