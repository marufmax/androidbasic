/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package androidbasic;

import java.util.Scanner;

/**
 *
 * @author Maruf Alom
 */
public class PrintListOfClass {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        float n,r;
        System.out.println("Enter total training hour:");
        n = input.nextFloat();
        System.out.println("Enter class hour");
        r = input.nextFloat();
        if (n>0 && r>0 && n>=r) {
            float total = n/r;
            System.out.println("Total class hour:"+total);
            for (int i = 1; i < total; i++) {
                System.out.println("List of classes:");
                System.out.println("Day- "+i);
            }
        }
        else {
            System.out.println("Please provide valid information!");
        }
        
    }
}
