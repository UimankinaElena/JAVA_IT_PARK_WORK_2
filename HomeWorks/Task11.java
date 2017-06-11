import java.util.Scanner;
public class Task11 {
	public static void main (String args []) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Vvedite kolichestvo chisel");
		int n = scanner.nextInt();
		int i=0;
		double sum = 0;
		double sredarif = 0;
		
		
		while(i < n) {
			System.out.println("Vvedite chislo " + (i+1));
		    double number = scanner.nextInt();
			sum = sum + number;			
		
			i = i + 1;
	    }
		sredarif = sum/n;
		System.out.println("Srednee arifmeticheskoe = " + sredarif);
    }		
}
		


