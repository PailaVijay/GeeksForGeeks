package CollectionsConcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArraysDeclaration {

	public static void main(String[] args) {

		
	// we can use different data types using Object class
	// method 1
	Object[] obj= new Object[5];
	
    obj[0]= "vijay";
    obj[1]= 101;
    obj[2]= 69.70;
    obj[3]= true;
    obj[4]='A';
    
    
    for(Object result:obj)
    {
    	System.out.println(result);
	}
    
    
    // Method -2
    
    Object[] player= {"vijay", 97,57.69,false,'Z'};
    
    for(int i=0;i<player.length;i++)
    {
    	System.out.println(player[i]);
    }
    
    
    
    
    
    
   // DIFFERNCE BETWEEN LIST AND SET
    // BY INSERTION ORDER
    
    ArrayList<String> list= new ArrayList();
    
    list.add("1z");
    list.add("2y");
    list.add("3x");
    list.add("2y");

    
    
    System.out.println(list);// IT WILL GIVE THE OUTPUT IN INSERTION ORDER AND DUPLICATES ARE ALLOWED
    
    
    // NOW WE WILL SEE THE SET INTERFACE
    
    Set<String> set= new HashSet();
    
    set.add("1z");
    set.add("2y");
    set.add("3x");
    set.add("2y");
    
    System.out.println(set);
    
    
	
    
	
	
	
	
	
	
	
		
	}
}
