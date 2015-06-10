package codingos;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0, readed = 0;
		
		System.out.print("Zahl: ");
		readed = sc.nextInt();
	
		for(int i = 0; i < readed; i++)
		{
			count++;
		}
		System.out.print("\n");
		
		if(count % 3 == 0)
			System.out.print("Fizz");
		if(count % 5 == 0)
			System.out.print("Buzz");
	}

}
