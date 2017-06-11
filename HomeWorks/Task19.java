import java.util.Scanner;
class Task19 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in); 
        System.out.println("Vvedite kolichestvo elementov massiva");
		int n = scanner.nextInt();
		int x[] = new int[n];
		
		System.out.println("Vvedite elementi massiva");
		int i = 0;
			while (i < n) {
			x[i] = scanner.nextInt();
			i++;
		    }
			
			int z = 0;
			
			for (z = n-1; z > 0; z--) {
				
			   for (int j=0; j < n-1; j++) {
			   
			    if (x[j] > x[j+1])  {
					
					int temp = x[j];
				    x[j] = x[j+1];
		            x[j+1] = temp;
				}
				
				}
			}
			
				
		int j = 0;
		while (j < n) {
			System.out.println(x[j]);
			j++;
	}
 }
}
		
		
	
