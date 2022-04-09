package CollectionsConcept;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v= new Vector();
		System.out.println(v.capacity());
		
        for(int i=0;i<=10;i++)
        {
        	v.add(i);
        }
        System.out.println(v.capacity());
        v.addElement("A");
        System.out.println(v.capacity());
		

	}

}
