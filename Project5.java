/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project5;

/**
 *
 * @author kennedy
 */
import java.util.Scanner;

public class Project5 {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter integers (enter -1 to stop):");
            System.out.println("------------------------------------------");
            System.out.println("| Number |   Even/Odd   | True/False |");
            System.out.println("------------------------------------------");
            
            int number;
            do {
                number = scanner.nextInt();
                
                if (number != -1) {
                    boolean even = isEven(number);
                    System.out.printf("|  %-6d| %-12s| %-11b|\n", number, even ? "Even" : "Odd", even);
                }
                
            } while (number != -1);
            
            System.out.println("------------------------------------------");
            System.out.println("Program stopped.");
        }
    }
    
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
