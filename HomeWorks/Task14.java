class Task14 {
	public static void main(String args[]) {
		
		int a[] = {3,4,2,8,9,5,11,0};
		
		int i = 0;
		int sum = 0;
		double sredarif = 0;
					
			while (i <= 7) {
				sum = sum + a[i];
				sredarif = (double)sum/8;
				
			i++;
		}
		System.out.println("Srednee arifmeticheskoe elementov massiva " + sredarif);
	}
}