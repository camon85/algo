package programmers.kakao_report;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
  public int[] solution(String[] id_list, String[] report, int k) {
    int[] answer = new int[id_list.length];

    // 신고대상 - 신고자들
    Map<String, Set<String>> reporteeMap = new HashMap<>();

    for (int i = 0; i < report.length; i++) {
      String[] split = report[i].split(" ");
      String reporter = split[0];
      String reportee = split[1];

      // 자기 자신을 신고할 수 없음
      if (reporter.equals(reportee)) {
        continue;
      }
      if (!reporteeMap.containsKey(reportee)) {
        Set<String> reporters = new HashSet<>();
        reporteeMap.put(reportee, reporters);
      }
      Set<String> reporters = reporteeMap.get(reportee);

      reporters.add(reporter);
      reporteeMap.put(reportee, reporters);
    }

    Map<String, Integer> reporterMap = new HashMap<>();
    for (String reportee : id_list) {
      Set<String> reporters = reporteeMap.get(reportee);
      if (reporters != null && reporters.size() >= k) {
        for (String reporter : reporters) {
          if (!reporterMap.containsKey(reporter)) {
            reporterMap.put(reporter, 1);
          } else {
            reporterMap.put(reporter, reporterMap.get(reporter) + 1);
          }
        }
      }
    }

    for (int i = 0; i < id_list.length; i++) {
      answer[i] = reporterMap.getOrDefault(id_list[i], 0);
    }
    return answer;
  }

}