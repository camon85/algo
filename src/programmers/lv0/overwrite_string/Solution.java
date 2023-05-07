package programmers.lv0.overwrite_string;

class Solution {
  public String solution(String my_string, String overwrite_string, int s) {
    StringBuilder sb = new StringBuilder(my_string);
    for (int i = 0; i < overwrite_string.length(); i++) {
      sb.setCharAt(i + s, overwrite_string.charAt(i));
    }
    return sb.toString();
  }

}