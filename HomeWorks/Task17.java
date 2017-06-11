class Task17 {
	public static void main(String args[]) {
		
		int a[] = {3,4,2,8,9,4,11,4};
		int b[] = new int[8];
		boolean isPrime = true;
			
     	
		for (int i = 0; i <= 7; i++) {
			   int temp = a[i];
			  for (int j = 0; j <= 7; j++) {
				   if (temp == a[j]) 
	               isPrime = false;
			  }
			if (isPrime)
				b[i] = temp;
			
				       
		}
	
		int i = 0;
		while (i <= 7) {
			   System.out.println(b[i]);
			   i=i+1;
		}
	}
	}
	


