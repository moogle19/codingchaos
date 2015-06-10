/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingchaos_01;

import java.util.ArrayList;

/**
 *
 * @author bottersb
 */
public class CodingChaos_01 {

    static ArrayList a;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        a = new ArrayList<>();
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        fibRecursion(Math.min(i, j));
        System.out.println(a.toString());
    }
    
    static int fibRecursion(int  n) {
        if ((n == 1) || (n == 0)) {
            if(n != 0) {
                a.add(n);
            }
            return n;
        }
        a.add(n);
        return fibRecursion(n - 1) + fibRecursion(n - 2);
    }
}
