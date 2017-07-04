import java.util.Random;

interface MsgInterface{
	void msg();
}

class MyException1 extends Exception implements MsgInterface{
	private int i = 5;

	public void msg(){ 
		System.out.println("Error message integer value: " + this.i);
	}
}

class MyException2 extends Exception implements MsgInterface{
	private String s = "Hello";

	public void msg(){
		System.out.println("Error message String: "+ this.s);
	}
}

class MyException3 extends Exception implements MsgInterface{
	private char c = 'a';

	public void msg(){
		System.out.println("Error message character: " + this.c);
	}
}

public class ErrorHandling{
	public static void error(int i) throws MyException1,MyException2,MyException3{
		if(i==1)
		throw new MyException1();
		else if(i==2)
		throw new MyException2();
		else if(i==3) 
		throw new MyException3();
		else 
		throw new NullPointerException();
	}

	public static void main(String [] args){
		Random rn = new Random();
		try{
			error(rn.nextInt(5));

		}catch(MyException1|MyException2|MyException3 e){
			/*if(e instanceof MsgInterface){
				((MsgInterface)e).msg();
			}*/
			e.msg();
			
		}finally{
			System.out.println("Final block running.....");
		}
	}
}
