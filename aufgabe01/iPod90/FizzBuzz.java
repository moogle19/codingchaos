package aufgabe01;

public class FizzBuzz {

	public FizzBuzz() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int zahl=Integer.parseInt(args[0].trim());
		
		for(int i=0; i<zahl; i++){
			if(i%3==0){
				System.out.print("Fizz");
				if(i%5==0){
					System.out.print("Buzz");
				}
			}else if(i%5==0){
				System.out.print("Buzz");
			}else{
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
		
	}
	
	
	

}
