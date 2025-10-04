/**
B - The Odd One Out
配点 : 200 点
 */
package atcoder.B;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    sc.close();
    String answer = func(s);
    System.out.println(answer);
  }

  public static String func(String s) {
    // System.out.println("start B func");

    char[] cArr = s.toCharArray();

    char cOne = cArr[0];
    char cTwo = ' ';
    char cAns = ' ';

    // System.out.println("cOne:" + cOne);
    for (int i = 1; i < cArr.length; i++) {
      // System.out.println("start for i=" + i);
      // System.out.println("cArr[i]:" + cArr[i]);
      if (cOne == cArr[i] && cTwo == ' ') {
        // System.out.println("cOne == cArr[i]");
        continue;
      } else {
        // System.out.println("cOne == cArr[i] else");
        if (cTwo == ' ') {
          // System.out.println("cTwo == ' '");
          cTwo = cArr[i];
          // System.out.println("cTwo:" + cTwo);
          continue;
        } else {
          // System.out.println("cTwo == ' ' else");
          if (cOne == cArr[i]) {
            // System.out.println("cOne == cArr[i]");
            cAns = cTwo;
            // System.out.println("cAns:" + cAns);
            break;
          } else {
            // System.out.println("cOne == cArr[i] else");
            cAns = cOne;
            // System.out.println("cAns:" + cAns);
            break;
          }
        }
      }
    }

    if (cAns == ' ') {
      cAns = cTwo;
    }

    return String.valueOf(cAns);
  }
}