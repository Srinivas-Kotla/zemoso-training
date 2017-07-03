class Outer1{
	public class Inner1{
		Inner1(String s){
			System.out.println("Inner created with input string - " + s);
		}
	}
}

class Outer2{
	public class Inner2 extends Outer1.Inner1{
		Inner2(Outer1 out){
			out.super("Hi");
		}
	}
} 

public class TestInnerClass{
	public static void main(String [] args){
		Outer1 out1 = new Outer1();
		Outer2 out2 = new Outer2();

		Outer1.Inner1 inn1 = out1.new Inner1("Hello");
		Outer2.Inner2 inn2 = out2.new Inner2(out1);
	}
}
