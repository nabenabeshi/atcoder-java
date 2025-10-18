/**
B - Most Frequent Substrings
配点 : 200 点
 */
package atcoder.B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    String S = sc.next();
    sc.close();
    String answer = func(N,K,S);
    System.out.println(answer); // SUBMIT
  }

  public static String func(int N,int K, String S) {

    List<String> list = new ArrayList<>();
    List<String> ansList = new ArrayList<>();

    for (int i=0;i<(N-K+1);i++) {
      StringBuilder sb = new StringBuilder();
      for (int j=i;j<i+K;j++) {
        sb.append(S.charAt(j));
      }
      System.out.println(sb.toString());
      list.add(sb.toString());
    }
    

    TreeSet<String> ts = new TreeSet<>(list);
    int[] tsIndexList = new int[ts.size()];
    int index = 0;

    int maxCount = 0;
    for (String s : ts) {
      int count = 0;
      for(String ss : list){
        if(s.equals(ss)){
          count++;
        }
      }
      tsIndexList[index++] = count;
      if (maxCount < count) {
        maxCount = count;
      }
      System.out.println(s + ":" + count);
    }

    StringBuilder sbAns = new StringBuilder();
    sbAns.append(maxCount);
    sbAns.append("\n");

    int tsIndexCount = 0;
    for (String val : ts) {
      if(tsIndexList[tsIndexCount] == maxCount){
        sbAns.append(val);
        sbAns.append(" ");
      }
      tsIndexCount++;
    }

    sbAns.setLength(sbAns.length()-1);

    return sbAns.toString();
  }
}