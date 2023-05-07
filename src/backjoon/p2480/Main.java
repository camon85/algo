package backjoon.p2480;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.SortedMap;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());

    SortedMap<Integer, Integer> map = new TreeMap<>();
    addKey(map, a);
    addKey(map, b);
    addKey(map, c);

    int result = 0;
    int size = map.keySet().size();
    if (size == 1) {
      result = 10000 + a * 1000;
    } else if (size == 2) {
      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if (entry.getValue() == 2) {
          result = 1000 + entry.getKey() * 100;
        }
      }
    } else {
      result = map.lastKey() * 100;
    }
    System.out.println(result);
  }

  public static void addKey(Map<Integer, Integer> map, int key) {
    if (!map.containsKey(key)) {
      map.put(key, 1);
    } else {
      map.put(key, map.get(key) + 1);
    }
  }
}
