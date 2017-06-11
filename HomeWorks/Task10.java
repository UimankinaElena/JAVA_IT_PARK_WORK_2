import java.util.Scanner;
public class Task10 {
	public static void main (String args []) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Vvedite kolichestvo chisel");
		int n = scanner.nextInt();
		int i=0;
		int min = 2147483647;
		
		
		while(i < n) {
			System.out.println("Vvedite chislo " + (i+1));
		    int number = scanner.nextInt();
			if (number < min) 
				min = number;
				i = i + 1;
	    }
		System.out.println("Minimalnoe chislo " + min);
    }		
}
		


