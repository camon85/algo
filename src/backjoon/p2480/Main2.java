package backjoon.p2480;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());

    int[] nums = new int[7];
    nums[a]++;
    nums[b]++;
    nums[c]++;

    int result = -1;
    int max = -1;
    for (int i = 1; i <= 6; i++) {
      if (nums[i] == 3) {
        result = 10000 + i * 1000;
        break;
      }
      if (nums[i] == 2) {
        result = 1000 + i * 100;
        break;
      }
      if (nums[i] == 1) {
        max = Math.max(max, i);
      }
    }

    if (result == -1) {
      result = max * 100;
    }
    System.out.println(result);
  }

}
