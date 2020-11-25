/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ggaaa.Model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Airam
 */
public class Histogram<String> {
    private final Map<String,Integer> map=new HashMap<>();
    public Integer get(String key){
        return map.get(key);
    }
    public Set<String> keySet(){
        return map.keySet();
    }
    public void increment(String key) {
    map.put(key,map.containsKey(key)? map.get(key) +1:1);    
    }
    
}
