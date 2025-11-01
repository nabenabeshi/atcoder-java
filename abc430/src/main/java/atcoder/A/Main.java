/**
A - Candy Cookie Law
配点 : 100 点
 */
package atcoder.A;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    sc.close();

    if (A>C) {
      System.out.println("No"); // SUBMIT
    }else{
      if (B<=D) {
        System.out.println("No"); // SUBMIT
      }else{
        System.out.println("Yes"); // SUBMIT
      }
    }
  }
}