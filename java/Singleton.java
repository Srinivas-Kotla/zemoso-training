package srinivas.assignment.singleton;

public class Singleton{
	String s;

	public static Singleton set(String a){
		Singleton x = new Singleton();
		x.s = a;
		return x;
	}	

	public void print(){
		System.out.println(this.s);
	}
}
