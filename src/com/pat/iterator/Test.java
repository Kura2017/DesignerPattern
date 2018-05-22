package com.pat.iterator;

public class Test {
	public static void main(String[] args) {
		NameRepository nr = new NameRepository();
		Iterator iterator = nr.getIterator();
		while(iterator.hasNext()) {
			String name = (String)iterator.next();
			System.out.println("Name : " + name);
			System.out.println("");
		}

		//		for(Iterator iter = nr.getIterator(); iter.hasNext();){
		//	         String name = (String)iter.next();
		//	         System.out.println("Name : " + name);
		//	      }    
	}
}
