public class Zokors extends Rodent{
	public Zokors(){
		super(false,"Blue",8);
		System.out.println("A Zokor with its toothOut: "+toothOut+ ", Color: " + color + ", tail length: " + tailLength);
	}

	public void getColor(){
		System.out.println("Zokor color: " + color);
	}

	public void move(){
		System.out.println("Too tired for that!!!");
	}

	public void walk(){
		System.out.println("Move 6 steps");
	}
}
