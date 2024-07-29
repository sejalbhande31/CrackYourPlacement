import java.io.*;
import java.util.*;

class PrintallDuplicates
{
  
    static List<Character> getDups(String str) {
        Map<Character, Integer> count = new HashMap<>();
        // Counting frequency of each character
        for (int i = 0; i < str.length(); i++) {
          char c = str.charAt(i);
          count.put(c, count.getOrDefault(c, 0) + 1);
        }
    
        List<Character> duplicates = new ArrayList<>();
        // Iterating through the map to find duplicate characters
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
          if (entry.getValue() > 1) {
            duplicates.add(entry.getKey());
          }
        }
    
        return duplicates;
  }

  public static void main(String args[])
  {
    String str = "test string";
    System.out.println(getDups(str));
  }
}