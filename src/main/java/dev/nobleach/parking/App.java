package dev.nobleach.parking;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class App 
{
    public static void main( String[] args )
    {
      System.out.println(findMinimumSpan(Arrays.asList(12, 6, 5, 2), 3));
    }

    public static int findMinimumSpan(List<Integer> occupied, int k) {
      // Sorts to [2, 5, 6, 12]
      Collections.sort(occupied);

      int n = occupied.size();
      int res = Integer.MAX_VALUE;

      for (int i = 0; i < (n - k + 1); i++) {
        res = Math.min(res, occupied.get(i + k - 1) - occupied.get(i) + 1);
      }

      // add one for occupied spot
      return res;
    }
}
