package codingos;

public class FizzBuzz {

	public static void main(String[] args) {
		int count = 0, readed = Integer.parseInt(args[0]);
			
		for(int i = 0; i < readed; i++)
		{
			count++;
		}
		
		if(count % 3 == 0)
			System.out.print("Fizz");
		if(count % 5 == 0)
			System.out.print("Buzz");
	}

}
