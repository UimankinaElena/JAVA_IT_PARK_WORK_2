public class Task20{
	public static void main(String args[]) {
		
		char text[] = {'3','2','3','1'};
		int x = 0;
		int y = 1;
		
		for (int i = 3; i >= 0; i--) {
			
			x = x + (text[i] - '0') * y;
			y = y * 10;
		}
		
		System.out.println (x);
		
	}
}
	
		
		
		