/******************************  FizzBuzz.java  *******************************/

import AlgoTools.IO;

/**
 * @version 10.06.15
 *  
 * @author nikrause
 */

public class FizzBuzz {

  public static void main(String[] argv) {
    toString(35);
  }

  public static void toString(int zahl) {
    for(int i = 0; i <= zahl; i++) {
      IO.println(fizzy(i));
    }
  }



  private static String fizzy(int i) {
    if(i%3 == 0) {
      if(i%5 == 0) {
        return "FizzBuzz";
      }
      else {
        return "Fizz";
      }
    }
    else if(i%5 == 0) {
      return "Buzz";
    }
    else {
      return i + "";
    }
  }
}

