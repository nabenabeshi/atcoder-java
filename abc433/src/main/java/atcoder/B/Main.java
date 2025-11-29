package atcoder.B;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] An = new int[N+1];
    An[1] = sc.nextInt();
    System.out.println("-1"); // SUBMIT
    for (int i = 2; i <= N; i++) {
      An[i] = sc.nextInt();
      int pointer = An[i];
      int ans = -1;
      for (int j = 1; j < i; j++) {
        System.err.println("p:" + pointer + " An[j]:" + An[j]);
        if (pointer < An[j]) {
          ans = j;
        }
      }
      System.out.println(ans); // SUBMIT
    }
    sc.close();
  }
}