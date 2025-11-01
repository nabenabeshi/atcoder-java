/**
B - Count Subgrid
配点 : 250 点
 */
package atcoder.B;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    System.out.println("N:" + N);
    System.out.println("M:" + M);

    int[][] S = new int[N+1][N+1];
    for (int i = 1; i <= N; i++) {
      String vals = sc.next();
      System.out.println("vals:"+ vals);
      System.out.println("vals.length():" + vals.length());
      for (int j=1;j<= vals.length();j++) {
        char val = vals.charAt(j-1);
        System.out.println("val:" + val);
        if (val=='#') {
          S[i][j] = 1;
        } else {
          S[i][j] = 0;
        }
        System.out.println("S["+i+"]["+j+"]:" + S[i][j]);
      }
    }
    sc.close();

    for (int i = 1; i <= N; i++) {
      for (int j = 1; j <= N; j++) {
        System.out.println(S[i][j]);
      }
    }

    System.out.println("(N - M + 1)"+ (N - M + 1));

    List<String> AnsList = new ArrayList<>();
    int ansCount = 0;
    
    for (int i = 1; i <= (N - M + 1); i++) {
      System.out.println("i:"+i);
      for (int j = 1; j <= (N - M + 1); j++) {
        System.out.println("j:" + j);
        StringBuilder sb = new StringBuilder();
        for (int k = i; k < i+M; k++) {
          for (int l = j; l < j+M; l++) {
            System.out.print("k:" + k);
            System.out.print(" l:" + l);
            sb.append(String.valueOf(S[k][l]));
            System.out.println(" :" + S[k][l]);
          }
        }
        String str = sb.toString();
        System.out.println(str);
        if(!AnsList.contains(str)){
          AnsList.add(str);
          ansCount++;
        }
      }
    }

    System.out.println(ansCount); // SUBMIT
  }
}
