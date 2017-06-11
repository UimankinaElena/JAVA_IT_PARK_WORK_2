import java.util.Scanner;
public class Task5 {
     public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Vvedite trexznachnoe chiclo a");
         int a = scanner.nextInt(); //225
         
        int a1 = a/2; // a1 = 112
	int ost1 = a % 2; // ost1 = 1
       
        int a2 = a1/2; // a2 = 56
	int ost2 = a1 % 2; // ost2 = 0
        
        int a3 = a2/2; // a3 = 28
	int ost3 = a2 % 2; // ost3 = 0
        
        int a4 = a3/2; // a4 = 14
	int ost4 = a3 % 2; // ost4 = 0
        
        int a5 = a4/2; // a5 = 7
	int ost5 = a4 % 2; // ost5 = 1
        
        int a6 = a5/2; // a6 = 7
	int ost6 = a5 % 2; // ost6 = 1
        
        int a7 = a6/2; // a7 = 1
	int ost7 = a6 % 2; // ost7 = 1
        
        System.out.println("V dvoichoi sisteme " + a7 + ost7 + ost6 + ost5 + ost4 + ost3 + ost2 + ost1);
     }
}
 