public class TestCycle{
	public static void main(String [] args){
		Cycle[] arr = new Cycle[3];

		arr[0] = new UniCycle(); // Upcasting the UniCycle, Bicycle and Tricycle
		arr[1] = new BiCycle();
		arr[2] = new TriCycle();

		for(int i=0;i<3;i++){
			arr[i].balance(); // won't implement anything unless the parent class has method with name balance
		}

		UniCycle c1 = (UniCycle)arr[0]; // Downcasting the array instances
		BiCycle c2 = (BiCycle)arr[1];
		TriCycle c3 = (TriCycle)arr[2];
	
		c1.balance(); 
		c2.balance();
		c3.balance();
	}
}
