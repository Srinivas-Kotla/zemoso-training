public class Gerbil extends Rodent{
	public Gerbil(){
		super(true,"Red",4);
		System.out.println("A Gerbil with its toothOut: "+toothOut+ ", Color: " + color + ", tail length: " + tailLength);
	}

	public void getColor(){
		System.out.println("Gerbil color: " + color);
	}

	public void move(){
		System.out.println("Slideee");
	}

	public void walk(){
		System.out.println("Move 4 steps");
	}
}
