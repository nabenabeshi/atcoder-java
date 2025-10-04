/**
A - OS Versions
配点 : 100 点
 */
package atcoder.A;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String x = sc.next();
    String y = sc.next();
    sc.close();
    String answer = func(x, y);
    System.out.println(answer);
  }

  public static String func(String x, String y) {
    String strAns = "Yes";

    String STR_O = "Ocelot";
    String STR_S = "Serval";
    String STR_L = "Lynx";

    if (x.equals(STR_O)) {
      if (y.equals(STR_S) || y.equals(STR_L)) {
        strAns = "No";
      }
    } else if (x.equals(STR_S)) {
      if (y.equals(STR_L)) {
        strAns = "No";
      }
    }
    return strAns;
  }
}