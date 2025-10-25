/**
C - Odd One Subsequence
配点 : 300 点
 */
package atcoder.C;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] arr = new int[N + 1];
    long[] leftCount = new long[N + 1];
    long[] rightCount = new long[N + 1];

    for (int i = 1; i <= N; i++) {
      arr[i] = sc.nextInt();
      rightCount[arr[i]]++;
    }
    sc.close();

    long ans = 0;

    long S = 0;

    for (int i = 1; i <= N; i++) {

      int v = arr[i];

      System.out.println("********************");
      System.out.println("v=" + v);

      S -= leftCount[v] * rightCount[v];
      rightCount[v]--;
      S += leftCount[v] * rightCount[v];

      System.out.println(" S=" + S);

      // パターン１：i=v,j=v,k!=v

      // vであるleftCount
      long leftCount_v = leftCount[v];
      System.out.println(" leftCount_v=" + leftCount_v);

      // vでないrightCount
      long rightCount_d = (N - 1 - i) - rightCount[v];
      System.out.println(" rightCount_d=" + rightCount_d);

      ans += leftCount_v * rightCount_d;
      System.out.println("  ans=" + ans);

      // パターン２：i!=v,j=v,k=v

      // leftCountのうちvでないもの
      long leftCount_d = i - leftCount[v];
      System.out.println(" leftCount_d=" + leftCount_d);

      // rightCountのうちvのもの
      long rightCount_v = rightCount[v];
      System.out.println(" rightCount_v=" + rightCount_v);

      ans += leftCount_d * rightCount_v;
      System.out.println("  ans=" + ans);

      // パターン３：i=w,j=v,k=w ただしv!=w
      long SPrime = S - (leftCount[v] * rightCount[v]);
      System.out.println(" SPrime=" + SPrime);
      ans += SPrime;
      System.out.println("  ans=" + ans);

      S -= leftCount[v] * rightCount[v];
      leftCount[v]++;
      S += leftCount[v] * rightCount[v];

      System.out.println(" S=" + S);
    }
    System.out.println(ans); // SUBMIT
  }
}