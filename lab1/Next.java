import java.util.Scanner;
class Next {
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		int a;     
		a = ss.nextInt();              
		System.out.println("The next number for the number " + a + " is " + (a + 1) + ".");
		System.out.println("The previous number for the number " + a +  " is " + (a - 1) + ".");
	}
}	