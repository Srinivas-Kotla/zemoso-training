import java.util.*;
public class VampireNumbers{
	
	public static boolean checkVampire(int i, int j){
		int[] arrayNum = new int[10];
		int[] arrayRes = new int[10];
		int dummy=i;
		int k =0;
		int count = 0;
		boolean isVamp = false;
// filling the arrays with zeros to avoid null characters
		for(int p=0;p<arrayNum.length;p++){  	
			arrayNum[p] = 0;
			arrayRes[p] = 0;
		}

// placing the digits of the fang pairs in an array
		while(dummy !=0){			 
			arrayNum[k] = dummy%10;
			dummy = dummy/10;
			k++;	
		}
		
		dummy = j;
		while(dummy !=0){
			arrayNum[k] = dummy%10;
			dummy = dummy/10;
			k++;
		}
		
		k=0;
		dummy = i*j;

// separating the digits of the product of the fang pairs and placing them in another array
		while(dummy !=0){
			arrayRes[k] = dummy%10;
			dummy = dummy/10;
			k++;
		}

// sorting both the arrays as only one way is possible for smallest number possible for a set of digits. Hence we can compare the values obtained from both the arrays.
		Arrays.sort(arrayNum);
		Arrays.sort(arrayRes);

//comparing each array cell if they get matched
		for(int p=0;p<arrayNum.length;p++){
			if(arrayNum[p] != arrayRes[p]){
				break;
			}
			else
				count++;
		}
//if all the cells of the arrays get matched and the number has even number of digits we set the isVamp flag to true.
		if(count == arrayNum.length && k%2!=1)
			isVamp = true;
			
	return isVamp;
}
	public static void main(String [] args){
		ArrayList<Integer> array = new ArrayList<Integer> (200);
		int index = 0;

		for(int i=0;i<array.size();i++){
			array.add(1000000);
		}

//loop for finding the vampire numbers with 2 digit fangs.
		for(int i = 10; i<100;i++){
			for(int j = i; j<100; j++){
				if(index == 200) 
					break;

				if(checkVampire(i,j) == true){
					array.add(index,i*j);
					index++;
				}

			}
		}

//loop for finding the vampire numbers with 2 digit fangs.
		for(int i = 100; i<1000;i++){
			for(int j = i; j<1000; j++){
				if(index == 200)
					break;

				if(checkVampire(i,j) == true && !array.contains(i*j)){
					array.add(index,i*j);
					index++;
				}
			}
		}

//sorting the array to get the first 100 vampire numbers
		Collections.sort(array);
		for(int i=0;i<100;i++){
			System.out.println(array.get(i));
		}
	}
}
