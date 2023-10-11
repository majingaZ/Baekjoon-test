package q10828;

import java.util.Scanner;

public class Stack {
	private int push;
	private int pop;
	private int top;
	private int size;
	private int[] stack;
	
	
	public Stack(int size) {
		this.size = size;
		stack = new int[size];
		top = -1;
	}
	
	public void push(int x) {
		stack[++top] = push;
	}
	
	public void pop (int pop) {
		if(stack[size] == 0) {
			System.out.println("-1");
		} else {
			top--;
			System.out.println(top);
		}
	}
	
	public void size (int size) {
		System.out.println(stack[size]);
	}
	
	public boolean empty() {
		if (top == -1) {
			System.out.println("1");
			return true;
		} else {
			System.out.println("0");
			return false;
		}
	}
	
	public int top() {
		if (top == -1) {
			return -1;
		} else {
			return stack[top];
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int order = sc.nextInt();
		
		for(int i=0; i<order; i++) {
			String strOder = sc.next();
			
		}
		sc.close();
		
	}
}
