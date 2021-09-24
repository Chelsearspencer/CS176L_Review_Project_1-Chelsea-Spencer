import java.util.Arrays;
import java.util.Scanner;

public class SumOfOdd {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter a positive integer");
		int integer = in.nextInt();
		
		int currentOddNumber = 1;
		int sum = 0;
		
		
		
		System.out.println("the first "+integer+ " positive odd integers");
		for (int i=0; i<integer;i++) {
				System.out.print(currentOddNumber+ " ");
				currentOddNumber = currentOddNumber+ 2;
		}
	
		
		
		System.out.println("");
		for(int i=1;i<=2 * integer;i++){
			if((i%2) != 0) {
				sum += i;
			}	
		}
		System.out.println("the sum of the first "+integer+ " positive odd integers is:");
		System.out.println(sum);
	
	
	
	}

}
