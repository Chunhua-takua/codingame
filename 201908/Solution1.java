import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse
        if (n == 0) {
            System.out.println(0);
            return;
        }
            

        int closest = 5526;
        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            if (Math.abs(closest) > Math.abs(t)) {
                closest = t;
            }
            else if (Math.abs(closest) == Math.abs(t) && t > 0) {
                closest = t;
            }
        }

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(closest);
        
    }
}