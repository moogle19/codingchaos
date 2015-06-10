/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingchaos_01;

/**
 *
 * @author bottersb
 */
public class CodingChaos_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //            int i = Integer.valueOf(args[1]);
            int i = 15;
        		for(int j = 1; j<=i; j++){
			if(j % 3 == 0){
				if(j %5 == 0) {
                                    System.out.println("FizzBuzz");
                                } else {
                                    System.out.println("Fizz");
                                }
                                continue;
			} if(j %5 == 0) {
				System.out.println("Buzz");
                                continue;
			} else {
				System.out.println(j);
			}
		}
    }
    
}
