package org.example;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Hashmap {
    public static void main(String[] args){
        Logger l = Logger.getLogger("com.api.jar");
        HashMap<Integer,String> map=new HashMap<>();
        String s1= "Key-Value pairs: ";

        map.put(4,"ram");
        map.put(2,"shyam");
        map.put(3,"jam");
        map.put(1,"spam");

        l.log(Level.INFO,()->"Size: " +map.size());
        l.log(Level.INFO,()->"Values : " + map.values());
        l.log(Level.INFO,()->"Keys : " + map.keySet());
        l.log(Level.INFO,()-> s1 + map.entrySet());

        l.log(Level.INFO,()-> "Getting a value"+map.get(2));

        l.info("After removing ");
        map.remove(2);
        l.log(Level.INFO,()-> s1 +map.entrySet());

        l.info("After replacing ");
        map.replace(1,"Friends");
        l.log(Level.INFO,()-> s1 + map.entrySet());
    }
}