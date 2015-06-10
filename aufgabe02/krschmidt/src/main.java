import java.util.Scanner;


public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		SquareInRectangle(num1, num2);
	}
	
	private static void SquareInRectangle(int num1, int num2)
	{	
		if(num1 > num2)
		{
			int tmp = num2;
			num2 = num1;
			num1 = tmp;
		}
		
		System.out.print(num1 + " ");
		if(num2-num1 > 0) SquareInRectangle(num1, num2-num1);
	}
}
