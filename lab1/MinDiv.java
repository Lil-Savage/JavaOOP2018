import java.util.Scanner;
class MinDiv {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a, i;  
		a = ss.nextInt();
		for (i = 2; i <= a; i++) {     
			if (a % i == 0) {
				System.out.print(i);
				break;
			}	
		}
	}
}	