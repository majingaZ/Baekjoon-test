package q2588;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		sc.close();

		int a = j % 10;
		int b = j % 100 / 10;
		int c = j / 100;

		System.out.println(i * a);
		System.out.println(i * b);
		System.out.println(i * c);
		System.out.println(i * j);
		
//		int num1 = sc.nextInt();
//		String num2 = sc.next();
//		sc.close();
//		
//		for(int i=2;i>=0;i--) {
//			char c = num2.charAt(i);
//			int ic = Character.getNumericValue(c);
//			System.out.println(num1 * ic);
//		}
//		int ic2 = Integer.parseInt(num2);
//		System.out.println(num1*ic2);

	}

}
