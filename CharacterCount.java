package org.hcl;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
public static void main(String[] args) {
	String s="Hai Iniyavan How Iniyavan You are Hai Iniyavan";
	String[] split = s.split(" ");
	Map<String,Integer> m=new HashMap<String,Integer>();
	for(String de :split) {
		if(m.containsKey(de)) {
			Integer count = m.get(de);
			m.put(de, count+1);
		}else {
			m.put(de, 1);
		}
	}
	System.out.println(m);
}
}
