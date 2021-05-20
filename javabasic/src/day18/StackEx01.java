package day18;

import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {

		Stack<String> st = new Stack<String>();
		st.push("0");
		st.push("1");
		st.push("2");
		System.out.println(st.pop());
		
		while(!st.empty()) {// 비어있지 않을때까지 반복
			System.out.println(st.pop());
		}
		
	}

}
