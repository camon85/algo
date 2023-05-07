package backjoon.p2525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int h = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());
    int t = Integer.parseInt(br.readLine());

    int resultH = (h + ((m + t) / 60)) % 24;
    int resultM = (m + t) % 60;
    System.out.println(resultH + " " + resultM);
  }
}
