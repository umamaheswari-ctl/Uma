package com.uma.training;
/* Enter your code here. Read input from STDIN. Print output to STDOUT */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {

  private Map<String, String> myMap = new HashMap<String, String>();

  public static void main(String[] args) {
    Solution s = new Solution();
    s.myMap.put("ab", "c");
    s.myMap.put("ac", "b");
    s.myMap.put("ba", "c");
    s.myMap.put("bc", "a");
    s.myMap.put("ca", "b");
    s.myMap.put("cb", "a");
    Scanner sc = new Scanner(System.in);
    int line = 0;
    int nb_line = 0;
    while (sc.hasNextLine()) {
      if (line == 0) {
        nb_line = new Integer(sc.nextLine());
        line++;
      } else {
        String result;
        String input = sc.nextLine();
        result = s.findMin(input);
        System.out.println(result.length());
        if (line++ >= nb_line) {
          break;
        }
      }
    }
  }

  public String findMin(String str) {
    for (int i = 0; i < str.length() - 1; i++) {
      
      if (str.charAt(i) != str.charAt(i+1)) {
        if ((i+2) < (str.length()-1) && str.charAt(i+1) != str.charAt(i+2) && str.charAt(i+2) == str.charAt(i+3)) {
          String sub = str.substring(i+1, i + 3);
          String result = this.myMap.get(sub);
          if (result != null) {
            String newString = new String(str.substring(0, i+1) + result + str.substring(i + 3, str.length()));
            return findMin(newString);
          }
        }
        else {
          String sub = str.substring(i, i + 2);
          String result = this.myMap.get(sub);
          if (result != null) {
            String newString = new String(str.substring(0, i) + result + str.substring(i + 2, str.length()));
            return findMin(newString);
          }
        }
      }
    }
    return str;
  }

}
//public class Str {
//
//}
