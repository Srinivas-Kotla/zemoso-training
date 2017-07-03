public class Mouse extends Rodent{
	public Mouse(){
		super(false,"Black",4);
		System.out.println("A Mouse with its toothOut: "+ this.toothOut+ ", Color: " + this.color + ", tail length: " + this.tailLength);
	}

	public void getColor(){
		System.out.println("Mouse color: " + this.color);
	}

	public void move(){
		System.out.println("Runnnnnn");
	}

	public void walk(){
		System.out.println("Move 2 steps");
	}	
}
