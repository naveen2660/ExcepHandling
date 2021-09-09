package excepx;

import java.util.Scanner;

public class Excep1 {

	public static void main(String[] args) {			
			Scanner t =  new Scanner(System.in);
			System.out.println("Enter first number: ");
			int i = t.nextInt();
			System.out.println("Enter the number to be divided: ");
			int j = t.nextInt();
			try {
			int k=i/j;
			
				System.out.println(k);
				throw new ArithmeticException();
			}

			catch(ArithmeticException e) {
				System.out.println(e);
			}
	}

}
