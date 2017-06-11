import java.util.Scanner;
public class Task4 {
     public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Vvedite chiclo a");
         int a = scanner.nextInt(); 
        
         System.out.println("Vvedite chiclo b");
         int b = scanner.nextInt(); 
       
         int c = a%b;
         System.out.println("Ostatok ot delenia chisel a , b = " + c);
     }
}