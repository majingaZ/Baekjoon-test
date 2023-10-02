package q8958;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		char[] chr = new char[80];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=0; i<a; i++) {
		String quiz = sc.next();
		}
		sc.close();
		for(int i=0; i<quiz.length; i++) {
		char[] chr = quiz.toCharArray();
//		}
//
		int[] num = new int[80];
		for(int j=0; j<chr.length; j++) {
			if (chr[i] == 'O') {
				num[j] = 1;
			}
			sum += num[j];
		}
		

//		for(int k=0; k<num.length; k++) {
//			sum += num[j];
//		}
		System.out.println(sum);
	}
}
}