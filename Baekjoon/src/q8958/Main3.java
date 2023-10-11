package q8958;

		import java.util.Scanner;

		public class Main3 {
		    public static void main(String[] args) {
		    	
		    	// gpt가 완성시킨 코드
		        Scanner sc = new Scanner(System.in);
		        int testCases = sc.nextInt();
		        
		        for (int i = 0; i < testCases; i++) {
		            String quiz = sc.next();
		            int score = calculateScore(quiz);
		            System.out.println(score);
		        }

		        sc.close();
		    }

		    private static int calculateScore(String quiz) {
		        int sum = 0;
		        int consecutiveOCount = 0;

		        for (int j = 0; j < quiz.length(); j++) {
		            if (quiz.charAt(j) == 'O') {
		                consecutiveOCount++;
		                sum += consecutiveOCount;
		            } else {
		                consecutiveOCount = 0;  // 'X'를 만나면 연속된 'O' 개수를 초기화합니다.
		            }
		        }

		        return sum;

	}

}
