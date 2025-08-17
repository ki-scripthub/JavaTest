package methods;

import java.util.Scanner;

public class SumOfNnaturalNumbers {
	public static void sumOfNat1() {
//        System.out.println("Enter a Number: ");
//        Scanner inputNum = new Scanner(System.in);
//        String a = inputNum.next();
//        System.out.println("Entered Number " + a);
//    	Scanner num = new Scanner("Enter a value: ");
    	Scanner num = new Scanner(System.in);
    	System.out.print("Enter a Number: ");
    	int number = num.nextInt();
    	num.close();
    	System.out.println("Sum of "+number+" Natural numbers: "+number*(number+1)/2);
    }
    
	
	public static void sumOfNat2(int number){
    	System.out.println("Sum of "+number+" Natural numbers: "+number*(number+1)/2);
	     }
	
	
    public static int sumOfNat3(){
       	System.out.print("Enter a Number: ");
       	Scanner number = new Scanner(System.in);
       	int value = number.nextInt();
 	   	number.close();
// 	   	return value;
// 	   	SumOfNnaturalNumbers obj1 = new SumOfNnaturalNumbers();
 	   	return value;
    }
    
     
    
    public static int sumOfNat4(int number) {
    	return number;
   }
    
}
