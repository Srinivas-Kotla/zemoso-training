public class OverloadConstruct{
	int num;
	char ch;
	float l;

//constructor with no arguments calling the overloaded constructor
	public OverloadConstruct(){   
		this(40 , 'x' ,7.4567456f); 
	}

//Overloaded constructor with input arguments
	public OverloadConstruct(int a, char b, float c){
		this.num = a;
		this.ch = b;
		this.l = c;
	}

	public void print(){
		System.out.println(this.num + "," + this.ch + "," + this.l);
	}
	public static void main(String [] args){
		new OverloadConstruct(2,'a', 0.5f).print(); // instance using default constructor
		new OverloadConstruct().print();  // instance using overloaded constructor
}
