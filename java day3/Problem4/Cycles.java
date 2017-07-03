interface Cycle{
	void move();
}

interface CycleFactory{
	Cycle getCycle();
}

class UniCycle implements Cycle{
	int wheels = 1;
	public void move(){
		System.out.println("Move on " + this.wheels + " wheel."); 
	}

}

class UniCycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new UniCycle();
	}
}

class BiCycle implements Cycle{
	int wheels = 2;
	public void move(){
		System.out.println("Move on " + this.wheels + " wheels."); 
	}

}

class BiCycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new BiCycle();
	}
}


class TriCycle implements Cycle{
	int wheels = 3;
	public void move(){
		System.out.println("Move on " + this.wheels + " wheels."); 
	}

}

class TriCycleFactory implements CycleFactory{
	public Cycle getCycle(){
		return new TriCycle();
	}
}

public class Cycles{
	public static void createCycle(CycleFactory cycle){
		Cycle c = cycle.getCycle();
		c.move();
	}

	public static void main(String[] args){
		createCycle(new UniCycleFactory());
		createCycle(new BiCycleFactory());
		createCycle(new TriCycleFactory());
	}
}








