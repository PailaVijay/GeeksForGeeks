package CollectionsConcept;

import java.util.ArrayList;

public class ArrayList_1 {

	public static void main(String[] args) {
		
		
		ArrayList<Object> list= new ArrayList<Object>();
		list.add("vijay");
		list.add(120);
		list.add(99.99);
		list.add(null);
		list.add(true);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		list.add(2, "kumar");
		
		System.out.println(list);
		
	}

}
