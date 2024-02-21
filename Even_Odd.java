import java.util.Scanner;

public class Project5 {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter integers (enter -1 to stop):");
            int number;
            
            System.out.println("----------------------------------------");
            System.out.println("| Number |   Even/Odd   |");
            System.out.println("----------------------------------------");
            
            do {
                number = scanner.nextInt();
                
                if (number != -1) {
                    String evenOrOdd = isEven(number) ? "Even" : "Odd ";
                    System.out.printf("|  %-6d| %-12s|\n", number, evenOrOdd);
                }
                
            } while (number != -1);
            
            System.out.println("----------------------------------------");
            System.out.println("Program stopped.");
        }
    }
    
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}

            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer or type 'exit' to finish.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
