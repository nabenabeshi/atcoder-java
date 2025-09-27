/**
B - Find Permutation 2
配点 : 100 点
 */
package atcoder.B;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
    String answer = func(n, arr);
    System.out.println(answer);
  }

  public static String func(int n, int[] arr) {
    List<Integer> al = new ArrayList<>();

    for (int arrVal : arr) {
      if (arrVal != -1) {
        if (al.contains(arrVal)) {
          return "No";
        }
        al.add(arrVal);
      }
    }
    Collections.sort(al);

    for (int i = 1; i <= n; i++) {
      // System.out.println("i:"+i);

      if (arr[i] == -1) {
        // System.out.println("arr[i] is " + arr[i]);

        for (int j = 1; j <= n + 1; j++) {
          // System.out.println(" j:" + j);
          if (!al.contains(j)) {
            // System.out.println(" j:"+j+" not found from al");
            arr[i] = j;
            al.add(j);
            break;
          }
          if (j == (n + 1)) {
            return "No";
          }
        }
      }
    }
    String strAns = "Yes\r\n";
    strAns += arr[1];
    for (int i = 2; i <= n; i++) {
      strAns += " " + arr[i];
    }

    return strAns;
  }
}