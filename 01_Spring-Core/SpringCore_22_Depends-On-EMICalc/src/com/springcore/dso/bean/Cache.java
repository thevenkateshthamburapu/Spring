package com.springcore.dso.bean;

import java.util.HashMap;
import java.util.Map;

public class Cache {
	
	private Map<String, Double> map = new HashMap<String, Double>();
	
	public void put(String key,Double val){
		
		map.put(key, val);
	}
	public Double get(String key){
		
		 return map.get(key);
	}
	public boolean contains(String key){
		return map.containsKey(key);
		
	}
	@Override
	public String toString() {
		return "Cache [map=" + map + "]";
	}
	

}
