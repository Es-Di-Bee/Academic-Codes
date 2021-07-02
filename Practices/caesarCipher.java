
import java.util.Scanner;
public class caesarCipher {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		char[] a = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		int shift = sc.nextInt();
		sc.nextLine();
		String input = sc.nextLine();
		for (int i = 0; i < input.length(); ++i) {
			if (input.charAt(i) == ' ') {
				System.out.print(' ');
				continue;
			}
			for (int j = 0; j < a.length; ++j) {
				if (input.charAt(i) == a[j]) {
					int position = j - shift;
					if (position >= 0) {
						System.out.print(a[position]);
					} else {
						position = 26 - Math.abs(position);
						System.out.print(a[position]);
					}
					
				}
			}
		}
		System.out.println();
	}

}
