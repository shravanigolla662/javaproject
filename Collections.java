package anudip;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(10);
		list.add("Mouni");
		list.add("Mouni");
		list.add(109.7);
		list.add("Topper");
		System.out.println(list);
		list.add(4,2);
		System.out.println(list);
		list.set(3, "java");
		list.add(null);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println( list.isEmpty());
		System.out.println(list.get(1));
		System.out.println(list.contains(10));
		System.out.println(list.contains(50));
		System.out.println(list.indexOf("Topper"));
		System.out.println(list);
		System.out.println(list.lastIndexOf("Mouni"));
		System.out.println(list.remove(0));
		System.out.println(list);
		System.out.println(list.remove("java"));
		System.out.println(list);

	}

}
