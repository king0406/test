package structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class Jihe {

	public static void main(String[] args) {

		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		Hashtable<String, Integer> hm1=new Hashtable<String, Integer>();
		ConcurrentHashMap<String, Integer> hm2=new ConcurrentHashMap<String, Integer>();
		hm.put("k", 1);
		hm.put("i", 2);
		hm.put("n", 3);
		hm.put("g", 4);
		hm.put("v", 5);
		hm.put("k", 2);
		System.out.println(hm.get("k"));
		HashMap<Integer, String> hm3=new HashMap<Integer, String>();
		hm3.put(1, "qw");
		hm3.put(18, "er");
		System.out.println(hm3.get(1));;
//		for(Entry<String, Integer> entry : hm.entrySet()){
//			System.out.println(entry.getKey() + ": " + entry.getValue());
//		}
		List<Integer> list1 = Arrays.asList(1,2,5,7,8,3,12);
		List<Integer> list2 = Arrays.asList(1,2,6,7,9,3,12);
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(list1);
		list.retainAll(list2);
		System.out.println(list);
		String a[]={"1","3","5","5","7","8","5","4","3","a"}, b[]={"1","2","3","4","8","66","6","5","5","10","a"};
        HashSet<String> sa=new HashSet<String>(Arrays.asList(a));
        sa.retainAll(Arrays.asList(b));
        System.out.println(sa);
        String[] temp = sa.toArray(new String[] {});
        System.out.println(temp);
        Object[] obj = sa.toArray();
	}

}
