package list;

import java.util.*;
//import java.util.LinkedList;
//import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
	List<String> student = new ArrayList<>();
		student.add("shubham");                            // add method 
		student.add("Vanya");
//		System.out.println(student);
//		
//		List<Integer> marks = new ArrayList();
//		marks.add(20);
//		marks.add(30);
//		
//		System.out.println(marks);
		List<String> Vegetable = new ArrayList<>();
		Vegetable.add("patato");
		Vegetable.add("Tomato");
		Vegetable.add("ladyfinger");
		
		student.addAll(Vegetable);                                 //addAll method:  one collection add in another collection
		
		System.out.println(student.get(3));                     // get() method
//		Vegetable.set(2, "pita");
//		System.out.println(Vegetable);                                 // set() method
		//Vegetable.remove(1);                          // remove() method
		
		//Vegetable.clear();                                 // clear() method
		
//		List<String> toRemove = new ArrayList();
//		toRemove.add("patato");
//		toRemove.add("Tomato");
//		
//		student.removeAll(toRemove);                    // removeAll() method
		
		//System.out.println(student.contains("jaiswal"));
		
		

//		Pair<String, Integer> p1 = new Pair("shubham", 20);
//		Pair<Boolean, String> p2 = new Pair(true, "hello");
//		
//		p1.Description();
//		p2.Description();

	}

}
