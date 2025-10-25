/**
A - Too Many Requests
配点 : 100 点
 */
package atcoder.A;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    sc.close();

    for (int i=1; i<=N;i++) {
      if (i<=M) {
        System.out.println("OK"); // SUBMIT
      }else{
        System.out.println("Too Many Requests"); // SUBMIT
      }
    }
  }

}