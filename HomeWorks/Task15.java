class Task15 {
	public static void main(String args[]) {
		
		int a[] = {3,4,2,8,9,5,11,0};
		
		int i = 0;
		int sumch = 0;
		
					
			while (i <= 7) {
				if (i%2 == 0) {
				sumch = sumch + a[i];
				}
				i++;
		}
		System.out.println("summa elementov massiva na chetnix pozichiax " + sumch);
	}
}