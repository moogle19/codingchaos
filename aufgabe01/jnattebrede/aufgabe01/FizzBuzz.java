package chaos;

public class FizzBuzz {
    


    public static void main(String[] argv) {
        
    int number = Integer.parseInt(argv[0]);
            

    for(int i=0; i<=number;i++) {

        if((i%3 == 0) && (i%5 == 0)) {
            System.out.print("\nFizzBuzz");
        }
        else if(i%3 == 0) {
            System.out.print("\nFizz");
        }
        else if(i%5 == 0) {
            System.out.print("\nFuzz"); 
        }
        else {
            System.out.print("\n"+i);
        }
    }
    
    }

}
