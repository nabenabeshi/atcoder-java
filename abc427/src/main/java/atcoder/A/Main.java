/**
A - ABC -> AC
配点 : 100 点
 */
package atcoder.A;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    sc.close();
    String answer = func(s);
    System.out.println(answer); // SUBMIT
  }

  public static String func(String s) {
    int iS = s.length() / 2;

    String strHead = s.substring(0, iS);
    String strBack = s.substring(iS+1, s.length());
    return strHead + strBack;
  }
}