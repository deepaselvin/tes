package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Api {
	public static void main(String[] args) {
		ArrayList<String> booklist  = new ArrayList<String>();
		booklist.add("harry");
		booklist.add("chetan");
		booklist.add("sydney");
		System.out.println(booklist);
		System.out.println(booklist.contains("sydney"));
		
		ArrayList all  = new ArrayList();
		all.add("hello");
		all.add(123);
        System.out.println(all);
        
        HashSet<String> books=new HashSet<String>();
        books.add("c");
        books.add("java");
        books.add("html");
        books.add("java");
        System.out.println(books);
		
        TreeSet<String> sort=new TreeSet<String>();
        sort.add("c");
        sort.add("java");
        sort.add("html");
        sort.add("java");
		System.out.println(sort);
		
		HashMap<String,Integer> book=new HashMap<String,Integer>();
		book.put("a", 800);
		System.out.println(book);
		
		for(Object obj: all) {
       
            System.out.println(obj);
        }
        

        for(String bookName: booklist) {
            System.out.println(bookName);
	}
	}
}


