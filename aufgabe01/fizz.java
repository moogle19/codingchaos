
public class fizz {

	public static void main(String[] args) {
		int zahl = Integer.parseInt(args[0]);
		System.out.println(zahl);
		for(int i = 0; i<= zahl; i++){
			if(i%3==0 && i%5==0){//beides
				System.out.println("FizzBuzz");
			}
			else if(i%3==0){//Ganzzahlig teilbar durch 3
				System.out.println("Fizz");
			}
			else if(i%5==0){//ganz durhc 5
				System.out.println("Buzz");
			}
			else{//nichts
				System.out.println(zahl);
			}
			
		}

	}

}

