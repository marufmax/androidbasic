
package androidbasic;

import java.util.Scanner;

/**
 *
 * @author Maruf Alom
 */
public class NumberOfClassChecking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float n,r;
        System.out.println("Enter total training hour:");
        n = input.nextInt();
        System.out.println("Enter class hour");
        r = input.nextInt();
        if (n>0 && r>0 && n>=r) {
            System.out.println("Total class hour:"+n/r);
        }
        else {
            System.out.println("Please provide valid information!");
        }
        
    }    
}
