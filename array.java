package week3;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ageSub = 0;
		int ageSub2 = 0;
		int[] age = new int[7];
		age[0] = 3;
		age[1] = 9;
		age[2] = 23;
		age[3] = 64;
		age[4] = 2;
		age[5] = 8;
		age[6] = 28;
		
		//subtract the value of the first element in the array from the value in the last element of the array
		ageSub = age[0] - age[age.length -1];
		System.out.println("Subtraction1 = " + + ageSub);
		
		//New array with one more element.
		int ageNew[] = new int [age.length + 1];
		for (int i = 0; i < age.length; i++ ) {
			ageNew[i] = age[i];
		}
		ageNew[ageNew.length -1] = 15;
		ageSub2 = ageNew[0] - ageNew[ageNew.length -1];
		System.out.println("Subtraction2 = " + + ageSub2);
		
				
		
		// Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int ageSum = 0;
		int ageAver = 0;
		int ageNewSum = 0;
		int ageNewAver = 0;
		
		for (int i = 0; i <age.length; i++) {
			ageSum = ageSum + age[i]; 
		}
		for (int i = 0; i <ageNew.length; i++) {
			ageNewSum = ageNewSum + ageNew[i]; 
		}
		
		System.out.println("Array age summary --> " + ageSum);
		System.out.println("Array ageNew summary --> " + ageNewSum);
		ageAver = ageSum / (age.length );
		ageNewAver = ageNewSum / (ageNew.length );
				
		System.out.println("Array age average (7 elements) --> " + ageAver);
		System.out.println("Array ageNew average (8 elements) --> " + ageNewAver);
		
		
		
	}
}
