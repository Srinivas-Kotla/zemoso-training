interface Hand{
	void move();
	void take();
}

interface Leg{
	void kick();
	void walk();
}

interface Face{
	void smile();
	void talk();
}

interface Human extends Hand,Leg,Face{
	void live();
}	

class Actions{
	public void live(){
		System.out.println("live()");
	}
}

class Srinivas extends Actions implements Human{
	public void move(){
		System.out.println("move()");
	}

	public void take(){
		System.out.println("take()");
	}
		
	public void kick(){
		System.out.println("kick()");
	}

	public void walk(){
		System.out.println("walk()");
	}

	public void smile(){
		System.out.println("smile()");
	}

	public void talk(){
		System.out.println("talk()");
	}

}

public class InterfaceTest{
	public static void hand(Hand h){
		h.move();
		h.take();
	}

	public static void leg(Leg l){
		l.kick();
		l.walk();
	}

	public static void face(Face f){
		f.smile();
		f.talk();
	}

	public static void human(Human h){
		h.live();
	}

	public static void main(String [] args){
		Srinivas s = new Srinivas();

		hand(s);
		leg(s);
		face(s);
		human(s);
	}
}
