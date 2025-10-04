/**
C - Upgrade Required
配点 : 300 点
 */
package atcoder.C;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
// import java.util.List;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    ArrayList<ArrayList<Integer>> arr2d = new ArrayList<ArrayList<Integer>>();
    for (int i = 1; i <= q; i++) {
      arr2d.add(new ArrayList<Integer>(Arrays.asList(sc.nextInt(), sc.nextInt())));
    }
    sc.close();
    String answer = func(n, q, arr2d);
    System.out.println(answer);
  }

  public static String func(int n, int q, ArrayList<ArrayList<Integer>> arr2d) {
    // System.out.println("start C func");
    ArrayList<Integer> osVerList = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      osVerList.add(i);
      // System.out.print(i + ",");
    }
    // System.out.println(" end");

    // System.out.println("arr2d.size():" + size);
    String strAns = "";
    Integer oldedOsVer = 1;

    for (ArrayList<Integer> ope : arr2d) {
      int opeNum = 0;
      Integer nowOsVer = ope.get(0);
      Integer newOsVer = ope.get(1);
      // System.out.print("ope:" + nowOsVer + "," + newOsVer + " ");

      if(nowOsVer < oldedOsVer){
        strAns += opeNum + "\n";
        continue;
      }

      Integer index = -1;
      for (int upOsVer = 1; upOsVer <= nowOsVer; upOsVer++) {
        // System.out.print(" finding "+upOsVer+" ");
        do {
          index = osVerList.indexOf(upOsVer);
          if (index == -1) {
            // System.out.println("not Found");
          } else {
            // System.out.print("Find. value:" + osVerList.get(index) + "index:" + index);
            osVerList.set(index, newOsVer);
            opeNum++;
            // System.out.println(" opeNum:" + opeNum);
          }

          // for (int os : osVerList) {
          //   System.out.print(os + ",");
          // }
          // System.out.println(" end");

        } while (index != -1);
      }
      oldedOsVer = nowOsVer + 1;
      strAns += opeNum + "\n";
    }
    // System.out.println(strAns);
    // System.out.println("end C func");

    return strAns;
  }
}