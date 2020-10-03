package week3;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = new String[6];
		names[0]="Sam";
		names[1]= "Tommy";
		names[2]= "Tim";
		names[3]= "Sally";
		names[4]= "Buck";
		names[5]= "Bob";
		
		//iterate through the array and calculate the average number of letters per name. Print the result to the console
		int namesSum = 0;
		int namesAver = 0;
		
		for (int i=0; i < names.length; i++) {
			
			namesSum = namesSum + names[i].length();
			
		}
		namesAver = namesSum / names.length -1;
		//System.out.println("Names sumary " + namesSum);
		System.out.println("Names average letters -->  " + namesAver);
		
		//concatenate all the names together, separated by spaces, and print the result to the console.
		String namesConc= " ";
		for (int i=0; i<names.length; i++) {
			namesConc = namesConc + " " + names[i];
		}
		System.out.print("Array names concanetated --> ");
		System.out.println(namesConc);
		
		//How do you access the last element of any array?
	//	names[names.length -1];	
		
		// How do you access the first element of any array?
		//names[0]
		
		
		//iterate over the nameLengths array and calculate the sum of all the elements in the array. 
		//Print the result to the console.
		int sum = 0;
		int[] nameLengths = new int[6];
			for (int i=0; i<nameLengths.length; i++) {
				nameLengths[i] = names[i].length();
				sum = sum + nameLengths[i];
		}
		
			System.out.println("Names sumary --> " + sum);
		
		// How do you access the first element of any array?
		//names[0]
			
		
		 
	}
	
	
	//Write a method that takes a String, word, and an int, n, as arguments and returns the word 
	//concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, 
	//I would expect the method to return “HelloHelloHello”).
	public static String repeatWord(String word , int argument) {
		int argNum = 4;
		String wordInt = "Hello ";
		String wordNew = " ";  		
		 for (int i=1; i <= argNum; ++i  ) {
			wordNew= wordNew + wordInt;			
		 }
		 return wordNew;
				 
	}
	
	
	//	Write a method that takes two Strings, firstName and lastName, 
	//and returns a full name (the full name should be the first and the last name as a String separated by a space).
	public static String showName(String name, String last) {
		String fullName = name + " " + last;
		return fullName;
	}		
	
	//Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	public static boolean sumArray(int[] numbers){
		int sum = 0;
		boolean greatNum = true;
		for (int number : numbers) {
			sum += number;		
		}
		if (sum > 100) {
			return (greatNum);
		}
		else {
			return (!greatNum);
		}
	}		
		//Write a method that takes an array of double and returns the average of
		//all the elements in the array
		public static  double numDouble(double[] elements) {
		double adding = 0;
		double avergNum = 0;
		for (int i=0; i<elements.length; i++){
			adding += elements[i];
		}			
		avergNum = adding / elements.length;
		return avergNum;  
		}
		
		//	Write a method that takes two arrays of double and returns true if the average of the elements 
		//in the first array is greater than the average of the elements in the second array.
		public static boolean compareArray ( double[] array1 , double[] array2) {
			double sum1 = 0;
			double sum2 = 0;
			double aver1 = 0;
			double aver2 = 0;
			boolean d = true;
			for (int i =0; i <array1.length; i++) {
				sum1 = sum1 += array1[i];
				sum2 = sum2 +=  array1[i];
			}
			aver1 = sum1 / array1.length;
			aver2 = sum2 /array2.length;
			if (aver1 > aver2) {
				
				return (d);
			}
				else {
					
			 return (!d);
				}
			}
			
		//Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
		//and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		public static boolean willBuyDrink(boolean temp ,  double money) {
		double moneyInPocket = 85;
		boolean isHotOutside = true;
		boolean buyDrink = true;
		if (moneyInPocket > 10.50 && (isHotOutside)) {
			return (buyDrink);
		}
			else {
				return (!buyDrink);
			}
		
			
		
}


	
		
	


}
