package leetcode.groupanagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
  public static void main(String[] args) {
    //    Input: strs = ["eat","tea","tan","ate","nat","bat"]
    //    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    //
    //    Input: strs = [""]
    //    Output: [[""]]
    //
    //    Input: strs = ["a"]
    //    Output: [["a"]]

    String[] strs1 = new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
    String[] strs2 = new String[] {""};
    String[] strs3 = new String[] {"a"};
    System.out.println(groupAnagrams(strs1));
    System.out.println(groupAnagrams(strs2));
    System.out.println(groupAnagrams(strs3));

    System.out.println(groupAnagrams2(strs1));
    System.out.println(groupAnagrams2(strs2));
    System.out.println(groupAnagrams2(strs3));
  }

  public static List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for (String str : strs) {
      char[] charArray = str.toCharArray();
      Arrays.sort(charArray);
      String key = String.valueOf(charArray);

      //      if (map.containsKey(key)) {
      //        map.get(key).add(str);
      //      } else {
      //        List<String> anagrams = new ArrayList<>();
      //        anagrams.add(str);
      //        map.put(key, anagrams);
      //      }

      List<String> anagrams = map.getOrDefault(key, new ArrayList<>());
      anagrams.add(str);
      map.put(key, anagrams);
    }
    return new ArrayList<>(map.values());
  }

  public static List<List<String>> groupAnagrams2(String[] strs) {
    Map<String, List<String>> map = new HashMap<>();
    for (String str : strs) {
      int[] count = new int[26]; // a~z size
      int length = str.length();
      for (int i = 0; i < length; i++) {
        count[str.charAt(i) - 'a']++;
      }
      String key = Arrays.toString(count);
      List<String> anagrams = map.getOrDefault(key, new ArrayList<>());
      anagrams.add(str);
      map.put(key, anagrams);
    }
    return new ArrayList<>(map.values());
  }

}
