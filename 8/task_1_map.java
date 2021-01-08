package homework;

import java.util.*;

public class task_1_map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,books> shelf=new TreeMap<Integer,books>();
		shelf.put(1, new books(1,"Tom",2,"beijing"));
		shelf.put(2, new books(2,"Jack",3,"shanghai"));
		shelf.put(3, new books(3,"John",4,"wulumuqi"));
		
		books cat=shelf.get(1);
		System.out.println(cat.getname());
		System.out.println(shelf.containsKey(2));
		System.out.println(shelf.containsValue(cat));
		
		// Í¨¹ýIterator±éÀúkey-value
		Iterator iter = shelf.entrySet().iterator();
		while(iter.hasNext()) {
		   Map.Entry entry = (Map.Entry)iter.next();
		   System.out.println("next : "+ entry.getKey() +" - "+((books)entry.getValue()).getname());
		}

	}

}
