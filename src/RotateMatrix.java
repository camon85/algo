public class RotateMatrix {
  public static void main(String[] args) {
    // 정사각형이라고 가정
    int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    System.out.println("# Origin Matrix");
    for (int[] num : nums) {
      for (int i : num) {
        System.out.print(i);
      }
      System.out.println();
    }
    /*
      123
      456
      789
     */
    // rotate right
    int[][] solved1 = solve1(nums);
    System.out.println("# Rotate Right");
    for (int[] num : solved1) {
      for (int i : num) {
        System.out.print(i);
      }
      System.out.println();
    }
    /*
      741
      852
      963
     */

    // rotate left
    int[][] solved2 = solve2(nums);
    System.out.println("# Rotate Left");
    for (int[] num : solved2) {
      for (int i : num) {
        System.out.print(i);
      }
      System.out.println();
    }
    /*
      369
      258
      147
     */

  }

  public static int[][] solve1(int[][] nums) {
    int length = nums.length;
    int[][] results = new int[length][length];

    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        results[i][j] = nums[length - 1 - j][i];
      }
    }
    return results;
  }

  public static int[][] solve2(int[][] nums) {
    int length = nums.length;
    int[][] results = new int[length][length];

    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        results[i][j] = nums[j][length - 1 - i];
      }
    }
    return results;
  }

}
