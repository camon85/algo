package programmers.kakao_report;

public class Main {
  public static void main(String[] args) {
    Solution solution = new Solution();
    String[] id_list = new String[] {"muzi", "frodo", "apeach", "neo"};
    String[] report = new String[] {
        "muzi frodo",
        "apeach frodo",
        "frodo neo",
        "muzi neo",
        "apeach muzi"};
    int k = 2;
    int[] solution1 = solution.solution(id_list, report, k);
    for (int i : solution1) {
      System.out.print(i);
    }
    // [2,1,1,0]

    System.out.println();
    id_list = new String[] {"con", "ryan"};
    report = new String[] {
        "ryan con",
        "ryan con",
        "ryan con",
        "ryan con"};
    k = 3;
    int[] solution2 = solution.solution(id_list, report, k);
    for (int i : solution2) {
      System.out.print(i);
    }
    // [0,0]

  }
}
