package com.hyx.springcloud;

import java.util.HashMap;
import java.util.Map;

public class MainTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put(null,null);
		System.out.println(map.get(null));
		
		map.put("liu", "jing");
		map.put("liu", "yun");
		System.out.println(map.get("liu"));
		for(Map.Entry<String, String> entry: map.entrySet()) {
			System.out.println("key:"+entry.getKey()  +"   value:"+entry.getValue() );
		}
	}
}
