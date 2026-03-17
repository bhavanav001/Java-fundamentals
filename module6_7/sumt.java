package module6_7;

import java.util.HashSet;

public class sumt {
  public static void findPairs(int[] arr, int target) { 
    HashSet<Integer> seen = new HashSet<>();
     for (int x : arr) { int complement = target - x; 
      if (seen.contains(complement)) {
         System.out.println("(" + complement + ", " + x + ")");
         } seen.add(x); } } public static void main(String[] args) 
         { 
          int[] arr = {2, 4, 3, 7, 6, 1};
           findPairs(arr, 7); // (3,4) and (1,6) 
           } 
          }

