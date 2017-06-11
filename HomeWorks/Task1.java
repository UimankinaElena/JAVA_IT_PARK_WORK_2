import java.util.Scanner;
public class Task1 {
     public static void main (String[] args) {
       System.out.println("Vvedite chiclo a");
       Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // 13678
        
      		int a5000 = a / 5000; // a5000 = 2
		System.out.println("5000 - " + a5000);
		a = a % 5000; // a = 3 768
		
		int a1000 = a / 1000; // a1000 = 3
		System.out.println("1000 - " + a1000);
		a = a % 1000; // a = 768
                
                int a100 = a / 100; // a100 = 7
		System.out.println("100 - " + a100);
		a = a % 100; // a = 68
                
                int a10 = a / 10; // a10 = 6
		System.out.println("10 - " + a10);
		a = a % 10; // a = 8
                
                int a5 = a / 5; // a5 = 1
		System.out.println("5 - " + a5);
		a = a % 5; // a = 3
                
                int a2 = a / 2; // a2 = 1
		System.out.println("2 - " + a2);
		a = a % 2; // a = 1
                
                int a1 = a / 1; // a1 = 1
		System.out.println("1 - " + a1);
		a = a % 1; // a = 0

     }
}

