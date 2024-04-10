package practiceDebug;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class ArrayList1 {

	public static void main(String[] args) {


		HashMap<String, Integer> ml=new HashMap();
		
		
		
		ml.put("uday", 1);
		ml.put("sagan", 2);
		ml.put("venky", 3);
		ml.put("shoba", 4);
		
		ml.remove("venky");
		
		Set<Entry<String,Integer>> s=ml.entrySet();
		
		System.out.println(ml);
		
	}
}
