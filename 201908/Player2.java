import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTx and initialTy, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        int currentTx = initialTx;
        int currentTy = initialTy;

        // game loop
        System.err.println("currentTx:" + currentTx + " currentTy:" + currentTy);
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // A single line providing the move to be made: N NE E SE S SW W or NW
            // System.out.println("SE");

            int deltaX = lightX - currentTx;
            int deltaY = lightY - currentTy;
            if (deltaX > 0 && deltaY > 0) {
                System.out.println("SE");
                currentTx++;
                currentTy++;
            }
            else if (deltaX > 0 && deltaY < 0) {
                System.out.println("NE");
                currentTx++;
                currentTy--;
            }
            else if (deltaX < 0 && deltaY > 0) {
                System.out.println("SW");
                currentTx--;
                currentTy++;
            }
            else if (deltaX < 0 && deltaY < 0) {
                System.out.println("NW");
                currentTx--;
                currentTy--;
            }
            else if (deltaX > 0 && deltaY == 0) {
                System.out.println("E");
                currentTx++;
                
            }
            else if (deltaX < 0 && deltaY == 0) {
                System.out.println("W");
                currentTx--;
            }
            else if (deltaX == 0 && deltaY > 0) {
                System.out.println("S");
                currentTy++;
            }
            else if (deltaX == 0 && deltaY < 0) {
                System.out.println("N");
                currentTy--;
            }
                
        }
    }
}