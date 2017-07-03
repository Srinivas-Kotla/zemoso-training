public abstract class Rodent{
	protected boolean toothOut;
	protected String color;
	protected int tailLength;

	public Rodent(){
		toothOut = false;
		color = "white";
		tailLength = 5;
		System.out.println("A Rodent with its toothOut: "+toothOut+ ", Color: " + color + ", 						tail length: " + tailLength);
	}

	public Rodent(boolean l,String s, int a){
		toothOut = l;
		color = s;
		tailLength = a;
	}

	public abstract void getColor();
		
	public abstract void move();
	
	public void eat(){
		System.out.println("Chewingggggg");
	}

	public void walk(){
		System.out.println("Move 1 step");
	}	
}
