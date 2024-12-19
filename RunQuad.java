package runquad;
import java.util.Scanner;

public class RunQuad {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = null;
        
        while(shape == null) {
            System.out.println("Select from the following: ");
            System.out.println("R - Rectangle");
            System.out.println("S - Square");
            System.out.println("P - Parallelogram");
            System.out.println("H - Rhombus");
            System.out.println("T - Trapezoid");
            String input = scanner.next();
            
            if (input.length() != 1) {
                System.out.println("Invalid input. Please enter a single character (R, S, P, H, or T only).");
                continue;
            }
            
            char choice = Character.toUpperCase(input.charAt(0));
            
            switch(choice) {
                case 'R':
                    shape = new Rectangle();
                    break;
                case 'S':
                    shape = new Square();
                    break;
                case 'P':
                    shape = new Parallelogram();
                    break;
                    
                case 'H':
                    shape = new Rhombus();
                    break;
                
                case 'T':
                    shape = new Trapezoid();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
        shape.showDescription();
        scanner.close(); 
    }
    
}