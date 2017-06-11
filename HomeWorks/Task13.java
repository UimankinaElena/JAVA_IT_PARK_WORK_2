
class Task13 {
	public static void main(String args[]) {
		
		int a[] = {3,4,2,8,9,5,11,0};
		
		int i = 0;
		int sum = 0;
					
			while (i <= 7) {
				sum = sum + a[i];
				
			i++;
		}
		System.out.println("Summa elementov massiva " + sum);
	}
}