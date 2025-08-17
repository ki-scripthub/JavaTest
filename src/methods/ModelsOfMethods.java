package methods;

import java.util.Scanner;

public class ModelsOfMethods {
	public static void main(String[] args){
		System.out.print("Enter a Number: ");
		Scanner value = new Scanner(System.in);
		int inputNumber = value.nextInt();
		System.out.println("You have entered "+inputNumber);

//		SumOfNnaturalNumbers.sumOfNat1();
		
//		SumOfNnaturalNumbers.sumOfNat2(inputNumber);
		
//		int number = SumOfNnaturalNumbers.sumOfNat3();
//		System.out.println("Sum of "+number+" Natural numbers: "+number*(number+1)/2);

//		int result = SumOfNnaturalNumbers.sumOfNat4(inputNumber);
//		System.out.println("Sum of "+result+" Natural numbers: "+result*(result+1)/2);
		
		value.close();
	}
}
