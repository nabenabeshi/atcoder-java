/**
C 300 点
 */
package atcoder.C;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int K = sc.nextInt();
    long[] Hn = new long[N];
    for (int i = 0; i < N; i++) {
      Hn[i] = sc.nextLong();
    }
    // System.out.println(""+Arrays.toString(Hn));
    Arrays.sort(Hn);
    System.err.println("" + Arrays.toString(Hn));
    long[] Bm = new long[M];
    for (int i = 0; i < M; i++) {
      Bm[i] = sc.nextLong();
    }
    // System.out.println("" + Arrays.toString(Bm));
    Arrays.sort(Bm);
    System.err.println("" + Arrays.toString(Bm));
    sc.close();

    int count = 0;

    int bdPtr = 0;

    for (int hdPtr = 0; hdPtr < N; hdPtr++) {

      long hdWeight = Hn[hdPtr];

      while(bdPtr < M && hdWeight > Bm[bdPtr]){
        bdPtr++;
      }

      if(bdPtr < M){
        count++;
        bdPtr++;
      }
      if(count >= K){
        System.out.println("Yes");  // SUBMIT
        return;
      }
      System.err.println("");
    }
    System.out.println("No"); // SUBMIT
  }
}