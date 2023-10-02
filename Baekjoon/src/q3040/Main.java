package q3040;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];
		for(int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
		}
		sc.close();
		
		int sum = 0;
		for(int i=0; i<num.length; i++) {
			sum += num[i];
		}
		
		for(int a=0; a<num.length; a++) {
			for(int b=0; b<num.length; b++) {
				if (a != b) {
					int svnSum = sum - num[a] - num[b];
					if(svnSum == 100) {
//						System.out.println(svnSum);
						
						for(int i=0; i<num.length; i++) {
							if (i != a && i != b) {
								System.out.println(num[i]);
							}
						}
						System.exit(0);
					}
				}
			}
		}
//		boolean stop = true;
//		while (stop) {
//			for (int i=0; i<num.length; i++) {
//				int inp = sc.nextInt();
//				
//				if (inp >= 1 && inp <= 99) {
//					num[i] = inp;
//				} else if (inp == num[i]) {
//					stop = false;
//					System.out.println("N");
//					break;
//				}
//				System.out.println(num[i]);
//			}
//		}
//			sc.close();
		}
}