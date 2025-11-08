/**
A 100 点
 */
package atcoder.A;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int H = sc.nextInt();
    int B = sc.nextInt();
    sc.close();

    if (H>B) {
      System.out.println(H-B); // SUBMIT
    }else{
      if (H<=B) {
        System.out.println(0); // SUBMIT
      }
    }
  }
}