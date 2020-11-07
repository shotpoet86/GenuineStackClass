/*Programmer: Austin Parker   Date: Nov 13, 2020
 * Assignment: PE 24.4
 * Description: Program creates memory stack. Then iterates thru loop looking for prime numbers up to 50.
 * If it finds prime number, it pushes number to the stack. If not prime, it pops number from stack.*/

import java.util.*;

public class GenericStackClass {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();
        /*variables*/
        int count = 0;
        int generatedNum = 1;
        boolean flag;
        /*while resulting number is less than or equal to 50, program will iterate thru loop*/
        while (generatedNum <= 50) {
            flag = true;
            /*loop iterates checking to see if generated number is prime. If not, loop stops*/
            for (int j = 2; j < generatedNum; j++) {
                if (generatedNum % j == 0) {
                    flag = false;
                    break;
                }
            }
            /*if flag is true, push to stack and add to count and generatedNum*/
            if (flag) {
                stack.push(generatedNum);
                count += 1;
            }
            generatedNum += 1;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}