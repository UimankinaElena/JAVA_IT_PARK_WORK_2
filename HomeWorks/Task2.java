import java.util.Scanner;
public class Task2 {
     public static void main (String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Vvedite chiclo a");
       int a = scanner.nextInt(); 
        
       System.out.println("Vvedite chiclo b");
         int b = scanner.nextInt(); 
        
         System.out.println("Vvedite chiclo c");
         int c = scanner.nextInt();
        
         int d = a + b + c;
         System.out.println("Summa chisel a, b, c = " + d);
     }
}
