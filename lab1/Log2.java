import java.util.Scanner;
class Log2 {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a, ans = 1, i = 0;            
		a = ss.nextInt();
		while (ans < a) {
			ans *= 2;
			i++;
		}
		System.out.println(i);                     
	}
}	