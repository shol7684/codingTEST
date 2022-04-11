package test;

import java.util.*;
public class IteratorEx {
   public static void main(String[] args) {
      Set<String> set = new HashSet<>();
      set.add("Java");
      set.add("JSP");
      set.add("Servlet");
      set.add("Database");
      set.add("Spring");

      Iterator<String> iterator = set.iterator();
      
      
      while(iterator.hasNext()) {
         String skill = iterator.next();
         System.out.println(skill);
      }
      
      System.out.println();

      Map<String, Integer> map = new HashMap<String, Integer>();
      map.put("Java", 88);
      map.put("JSP", 70);
      map.put("Database", 90);
      map.put("Spring", 60);

      Set<String> keySet = map.keySet();
      Iterator<String> keyIterator = keySet.iterator();
      while(keyIterator.hasNext()) {
         String key = keyIterator.next();
         Integer value = map.get(key); 
         System.out.println(key + " : " + value);
      }
      
      
      
   }
}