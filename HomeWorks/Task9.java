import java.util.Scanner;
public class Task9 {
	public static void main (String args []) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Vvedite kolichestvo chisel");
		int n = scanner.nextInt();
		int i=0;
		int max = - 2147483648;
		
		
		while(i < n) {
			System.out.println("Vvedite chislo " + (i+1));
		    int number = scanner.nextInt();
			if (number > max) 
				max = number;
				i = i + 1;
	    }
		System.out.println("Maksimalnoe chislo " + max);
    }		
}
		



	