public class TestRodent{
	public static void main(String [] args){
		Rodent [] arr = new Rodent[5];

		arr[0] = new Mouse();
		arr[1] = new Hamster();
		arr[2] = new Gerbil();
		arr[3] = new Lemming();
		arr[4] = new Zokors();

		for(int i=0;i<5;i++){
			arr[i].eat();
			arr[i].getColor();
			arr[i].move();
			arr[i].walk();
		}
		
	}
}
