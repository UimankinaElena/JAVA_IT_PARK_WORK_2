import java.util.Scanner;
class Task18 {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in); 
        System.out.println("Vvedite kolichestvo elementov massiva");
		int n = scanner.nextInt();
		int a[] = new int[n];
		
		System.out.println("Vvedite elementi massiva");
		int i = 0;
			while (i < n) {
			a[i] = scanner.nextInt();
			i++;
		    }
			
		int min = 0;
		for (int j=0; j < n; j++)	{
			
		    for (int z = 0; z < n; z++) {	     
			    min = a[j];
			    if (a[z] > min) {
				
				  min = a[z];
		  	      int temp = a[j];
				  a[j] = min;
		          a[z] = temp;
				  
				}
		      
		    }
		}
		
		int j = 0;
		while (j < n) {
			System.out.println(a[j]);
			j++;
	}
 }
}
		
		
	

	
		
		
		