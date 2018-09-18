import java.util.Scanner;
class Div {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a, i;  
		a = ss.nextInt();
		for (i = 1; i <= a; i++) {     
			if (a % i == 0) {
				System.out.print(i + " ");
			}	
		}
	}
}	