/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project4;

/**
 *
 * @author kennedy
 */
public class Project4 {
    public static void main(String[] args) {
        System.out.println("Pythagorean Triples (side1, side2, hypotenuse):");
        System.out.println("-----------------------------------------------");
        
        for (int side1 = 1; side1 <= 500; side1++) {
            for (int side2 = 1; side2 <= 500; side2++) {
                for (int side3 = 1; side3 <= 500; side3++) {
                    // Check if the sides satisfy the Pythagorean theorem
                    if (side1 * side1 + side2 * side2 == side3 * side3) {
                        // Display the Pythagorean triple in a table format
                        System.out.printf("%-5d %-5d %-5d%n", side1, side2, side3);
                    }
                }
            }
        }
    }
}
