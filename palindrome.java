import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		int originalNumber = number;
		int reversedNumber = 0;
		
		while (number != 0){
		    int digit = number % 10;
		    reversedNumber = reversedNumber * 10 + digit;
		    number = number / 10;
	    }
	    if(originalNumber == reversedNumber){
	        System.out.println(originalNumber + " is palindrome");
	    }
	    else{
	        System.out.println(originalNumber + " is not palindrome");
	    }
}
}
