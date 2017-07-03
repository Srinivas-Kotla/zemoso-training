public class Hamster extends Rodent{
	public Hamster(){
		super(true,"Brown",2);
		System.out.println("A Hamster with its toothOut: "+toothOut+ ", Color: " + color + ", tail length: " + tailLength);
	}

	public void getColor(){
		System.out.println("Hamster color: " + color);
	}

	public void move(){
		System.out.println("Walkkkkkk");
	}

	public void walk(){
		System.out.println("Move 3 steps");
	}
}
