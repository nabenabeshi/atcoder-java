/**
C - Truck Driver
配点 : 300 点
 */
package atcoder.C;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    String S = sc.next();
    sc.close();

    System.out.println("N:" + N);
    System.out.println("A:" + A);
    System.out.println("B:" + B);
    System.out.println("S:" + S);

    long[] aPrefixSum = new long[N + 1];
    long[] bPrefixSum = new long[N + 1];

    // 累積和の計算
    for (int i = 1; i <= N; i++) {

      char current = S.charAt(i - 1);

      aPrefixSum[i] = aPrefixSum[i - 1];
      bPrefixSum[i] = bPrefixSum[i - 1];

      if (current == 'a') {
        aPrefixSum[i]++;
      } else {
        bPrefixSum[i]++;
      }
      System.out.println("Pa:"+aPrefixSum[i]+",Pb:"+bPrefixSum[i]);
    }

    long totalCnt = 0;

    int rMinP = 1;
    int rMaxP = 1;

    for (int l = 1; l <= N; l++) {
      System.out.print("l:"+l);

      rMinP = Math.max(rMinP, l);

      while (rMinP <= N && aPrefixSum[rMinP] < aPrefixSum[l - 1] + A) {
        rMinP++;
      }

      while (rMaxP <= N && bPrefixSum[rMaxP] < bPrefixSum[l - 1] + B) {
        rMaxP++;
      }

      int rMax = rMaxP - 1;

      int startR = rMinP;
      int endR = rMax;

      System.out.print(" startR:" + startR);
      System.out.print(" endR:" + endR);

      if (endR >= startR) {
        totalCnt += (long)(endR - startR + 1);
      }

      System.out.println("");
    }

    System.out.println(totalCnt); // SUBMIT
  }
}