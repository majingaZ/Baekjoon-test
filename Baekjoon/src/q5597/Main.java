package q5597;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
				11, 12,	13, 14, 15, 16, 17, 18, 19, 20,
				21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
		int[] inp = new int[28];
		int[] non = new int[2];
		
		for(int i=1; i<inp.length;i++) {
			inp[i] = sc.nextInt();
			boolean diff = true;
			for(int j=1; j<num.length; i++) {
				if (inp[i] == num[i]) {
					diff = false;
					break;
				} else {
					diff = true;
					non[j] = num[i];
					System.out.println(non[j]);
				}
			}
		}
		sc.close();
		
	}

}
