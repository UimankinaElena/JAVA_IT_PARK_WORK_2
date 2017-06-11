class Task16 {
	public static void main(String args[]) {
		
		int a[] = {3,4,2,8,9,5,11,0};
		
		
		for (int i = 0; i <= 3; i++) {
			int temp = a[i];
			a[i] = a [8-1-i];
			a [8-1-i] = temp;
			
		}
		System.out.println("Perevernytii massiv");
	
     	for (int i = 0; i <= 7; i++)
		System.out.println(a[i]);
	}
}