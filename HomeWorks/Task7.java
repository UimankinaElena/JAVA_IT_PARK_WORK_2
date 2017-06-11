import java.util.Scanner;
public class Task7 {
	public static void main (String args []) {
		
		int i=0;
		int proizvedenie = 1;
		
		while(i < 10) {
			Scanner scanner = new Scanner (System.in);
			System.out.println("Enter number" + (i+1));
		    int n = scanner.nextInt();
			i = i + 1;
			if (n % 2 != 0) {
				proizvedenie = proizvedenie * n;
			}	
		}
		System.out.println("Proizvedenie nechetnix chisel " + proizvedenie);
	}
}


	