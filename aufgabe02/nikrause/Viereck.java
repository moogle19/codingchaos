/******************************  Viereck.java  ********************************/

import AlgoTools.IO;

/**
 * @version 10.06.15
 *  
 * @author nikrause
 */

public class Viereck {

  public static void main(String[] argv) {

    IO.println("Hi");

     int[] help = SquareInRectangle(7,10);
     for(int i = 0; i < help.length; i++) {
        IO.println(help[i]);
     }

  }

  public static int[] SquareInRectangle(int a, int b) {
    int[] rueck = new int[0];
    while(a - b != 0) {
      
      if(a < b) {
        int tmp = a;
        a = b;
        b = tmp;
      }

      int[] help = new int[rueck.length+1];
      for(int i = 0; i < rueck.length; i++) {
        help[i] = rueck[i];
      }
      help[rueck.length] = b;

      a = a - b;
      
      rueck = help;
    }

    int[] help = new int[rueck.length+1];
    for(int i = 0; i < rueck.length; i++) {
      help[i] = rueck[i];
    }
    help[rueck.length] = b;

    return help;
  }
}

