                   /* swap without third variable*/
package assignment5;
				// IMPORT SCANNER 
import java.util.Scanner;
public class swap {

	public static void main(String[] args) {
				// PROVIDE VALUE BY USER
		int a,b;
		Scanner ob = new Scanner(System.in);
		System.out.println("enter the value of a");
				a=ob.nextInt();
		System.out.println("enter the value of b");
				b=ob.nextInt();
				// CONDITION FOR SWAP
				
		a=a+b;
		b=a-b;
		a=a-b;
		
				// PRINTING VALUE
			System.out.println("swap value of a is " +a);
			System.out.println("swap value of b is " +b);
				
			
	} 

}
