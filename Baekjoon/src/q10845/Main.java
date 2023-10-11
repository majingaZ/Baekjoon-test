package q10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static Queue<Integer> q = new LinkedList<>();
	
	int push;
	int pop;
	int size;
	int front;
	int back;
	int[] main;

	void push(int x) {
		main[++front] = push;
	}

	int pop(int pop) {
		if (main[size] == 0) {
			System.out.println("-1");
		} else {
			front--;
			System.out.println(front);
		}
		return pop;
	}

	void size(int size) {
		System.out.println(main[size]);
	}

	boolean isEmpty() {
		if (front == -1) {
			System.out.println("1");
			return true;
		} else {
			System.out.println("0");
			return false;
		}
	}

	boolean front() {
		if (front == -1) {
			System.out.println("-1");
			return true;
		} else {
			System.out.println(front);
			return false;
		}
	}

	void back() {
	    Integer last = ((LinkedList<Integer>) q).peekLast();
	    if (last == null)
	        System.out.println("-1");
	    else
	        System.out.println(last);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		Queue<Integer> q = new LinkedList<Integer>();
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			String inp = br.readLine();
			StringTokenizer st = new StringTokenizer(inp);
			String cmd = "";
			int num = 0;
			if (st.hasMoreTokens()) {
				cmd = st.nextToken();
			}
				if (st.hasMoreTokens()) {
				num = Integer.parseInt(st.nextToken());
			}

			switch (cmd) {
			case "push":
				q.offer(num);
				break;
			case "pop":
				q.poll();
				break;
			case "size":
				q.size();
				break;
			case "empty":
				q.isEmpty();
				break;
			case "front":
				q.peek();
				break;
			case "back":
				if (q.isEmpty())
                    System.out.println("-1");
                else
                    System.out.println(((LinkedList<Integer>) q).peekLast());
                break;
			}
		}
	}
}