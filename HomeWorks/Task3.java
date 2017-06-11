import java.util.Scanner;
public class Task3 {
     public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Vvedite chiclo a");
         int a = scanner.nextInt(); 
       
         System.out.println("Vvedite chiclo b");
         int b = scanner.nextInt(); 
         
         int c = a/b;
         System.out.println("Chastnoe chisel a, b = " + c);
     }
}
