package day18;

import java.util.LinkedList;

public class LinkedEx01 {

	public static void main(String[] args) {

		LinkedList<String> mylist = new LinkedList<String>();
		mylist.add("test1");
		mylist.add("test2");
		mylist.add("test3");
		mylist.add("test4");
		mylist.add("test5");
		mylist.add(2, "100");
		System.out.println(mylist);
		
		mylist.addFirst(null);
		System.out.println(mylist);
	}

}
