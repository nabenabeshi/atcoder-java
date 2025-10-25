/**
B - N - 1
配点 : 200 点
 */
package atcoder.B;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();

    // 対象外ループ
    for (int i = 0; i < N; i++) {

      System.out.print("対象外 i=" + i + " " + arr[i] + " ");

      // 足す先頭ループ
      for (int j = 0; j < N; j++) {
        if (i == j) {
          continue;
        }
        int ans = arr[j];
        System.out.print("j=" + j + " " + ans + " ");
        // 足し込みループ
        for (int k = 0; k < N; k++) {
          if (i == k || j == k) {
            continue;
          }
          ans += arr[k];
          System.out.print("k=" + k + " " + ans + " ");
        }

        System.out.println("ans " + ans);
        if (M == ans) {
          System.out.println("Yes"); // SUBMIT
          return;
        }
      }
    }
    System.out.println("No"); // SUBMIT
  }
}