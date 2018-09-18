import java.util.Arrays;
class Example {
	public static void main(String[] args) {
		Student s = new Student("asd", 1000);
		System.out.println(s.getName());
		
		StarTriangle small = new StarTriangle(5);
		System.out.println(small.toString());

		Time t = new Time(23, 5, 6);
		System.out.println(t.toUniversal());
		System.out.println(t.toStandard());
		Time t2 = new Time(4, 24, 33);
		System.out.println(t2.toUniversal());
		System.out.println(t2.toStandard());
		t.add(t2);
		System.out.println(t.toUniversal());
		System.out.println(t.toStandard());

		Time.add(t, t2);
		System.out.println(t.toUniversal());
		System.out.println(t.toStandard());
		
		int[] a = {1, 2, 3};
		int[] b = problem5(a);
		int i;
		for (i = 0; i < b.length; i++)
			System.out.print(b[i] + " ");
		System.out.println();

		System.out.println(inWords(5627));
		//System.out.println(inWords(3450));
		//System.out.println(inWords(34500));
	}

	public static int[] problem5(int[] a) {
		int i;
		int[] temp = new int[2 * a.length];
		for (i = 0; i < a.length; i++) {
			temp[2 * i] = a[i];
			temp[2 * i + 1] = a[i];
		}                        
		return temp;
	}

	public static String inWords(int number) {
		int t = number;
		int c;
		int l = 10000;
		String s = "";
		while (t > 1) {
			c = t / l;
			if ((l == 10) || (l == 10000)) 
				switch (c) {
					case 1: s += "one "; break;
					case 2: s += "twenty "; break;
					case 3: s += "thirty "; break;
					case 4: s += "forty "; break;
					case 5: s += "fifty "; break;
					case 6: s += "sixty "; break;
					case 7: s += "seventy "; break;
					case 8: s += "eighty "; break;
					case 9: s += "ninety "; break;
				}
			else
				switch (c) {
					case 1: s += "one "; break;
					case 2: s += "two "; break;
					case 3: s += "three "; break;
					case 4: s += "four "; break;
					case 5: s += "five "; break;
					case 6: s += "six "; break;
					case 7: s += "seven "; break;
					case 8: s += "eight "; break;
					case 9: s += "nine "; break;
				}                           
			if (c > 0)
				switch (l) {
					case 1000: s += "thousands "; break;
					case 100: s += "hundred "; break;
				}
			t %= l;
			l /= 10;
		}
		return s;
	}
}