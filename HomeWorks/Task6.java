import java.util.Scanner;
public class Task6 {
	public static void main (String args []) {
		
		int i=0;
		int sum = 0;
		
		while(i < 10) {
			Scanner scanner = new Scanner (System.in);
			System.out.println("Enter number" + (i+1));
		    int n = scanner.nextInt();
			i = i + 1;
			if (n % 2 == 0) {
				sum = sum + n;
			}	
		}
		System.out.println("Summa chetnix chisel " + sum);
	}
}


	