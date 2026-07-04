package org.tech.behavior.Interpreter.example2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Test {

	public static final TreeMap<String, Object> map = new TreeMap<>();
	
	public static void main(String[] args) {

		List<Map<String, Object>> rateList = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new TreeMap<String, Object>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		System.out.println(map.size());
		
	}
}
