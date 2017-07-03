public class Lemming extends Rodent{
	public Lemming(){
		super(false,"white",7);
		System.out.println("A Lemming with its toothOut: "+toothOut+ ", Color: " + color + ", tail length: " + tailLength);
	}

	public void getColor(){
		System.out.println("Lemming color: " + color);
	}

	public void move(){
		System.out.println("Swimmm!!!!");
	}

	public void walk(){
		System.out.println("Move 5 steps");
	}
}
