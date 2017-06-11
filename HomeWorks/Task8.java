import java.util.Scanner;
public class Task8 {
	public static void main (String args []) {
		
		int i=0;
		int sum = 0;
		
		while(i < 10) {
			Scanner scanner = new Scanner (System.in);
			System.out.println("Enter number" + (i+1));
		    int n = scanner.nextInt();
			i = i + 1;
			if (n % 10 == 7) {
				sum = sum + n;
			}	
		}
		System.out.println("Summa chisel s okonchaniem 7 " + sum);
	}
}


	