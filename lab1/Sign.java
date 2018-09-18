import java.util.Scanner;
class Sign {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a;  
		a = ss.nextInt();
		if (a > 0)
			System.out.println("1");
		else
		if (a < 0)
			System.out.println("-1");
		else 
			System.out.println("0");
	}
}	