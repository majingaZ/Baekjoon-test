package q9012;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		// 2. 선생님 풀이 (스택 이용)
		Scanner sc = new Scanner(System.in);
		Stack<Character> stk = new Stack<Character>(); // 스택 생성

		int num = sc.nextInt(); // 테스트 데이터 정수 입력
		for (int i = 0; i < num; i++) { // 입력받은 숫자만큼 반복해서 문자열 입력
			String inp = sc.next();
			boolean bStr = true; // 스택의 상태 점검을 위한 논리 bStr 선언
			stk.clear(); // 다음 케이스 점검을 위해 스택 비우기
			
			for (int j = 0; j < inp.length(); j++) { // 문자열 길이만큼 반복
				if (inp.charAt(j) == '(') { // 문자로 변환해서 '('일 경우
					stk.push('('); // 스택에 추가
				} else {
					if (stk.isEmpty()) { // 스택이 비어있을 경우
						bStr = false; // 이 조건은 false가 됨
						break;
					} else {
						stk.pop(); // 스택에 값이 있다면 꺼내기
					}
				}
			} // for문 종료 후
			if (stk.isEmpty() && bStr == true) { // 스택이 비어있고 bStr이 true일 경우
				System.out.println("YES"); // YES 출력
			} else {
				System.out.println("NO"); // 조건이 맞지 않으면 NO 출력
			}
		}

		// 1. 내가 푼 방법
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//
//		for (int i = 0; i < num; i++) {
//			String inp = sc.next();
//			int cnt = 0;
//
//			for (char c : inp.toCharArray()) {
//				if (c == '(') {
//					cnt++;
//				} else {
//					cnt--;
//				}
//
//				if (cnt < 0) {
//					break;
//				}
//			}
//			if (cnt == 0) {
//				System.out.println("YES");
//			} else {
//				System.out.println("NO");
//			}
//		}
//		sc.close();
	}
}
