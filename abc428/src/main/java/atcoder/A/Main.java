/**
A - Grandma's Footsteps
配点 : 150 点
 */
package atcoder.A;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int S = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int X = sc.nextInt();
    sc.close();
    String answer = func(S,A,B,X);
    System.out.println(answer); // SUBMIT
  }

  public static String func(int S,int A, int B, int X) {
    // 走った距離
    int iFar = 0;

    // 残り時間
    int iRestTime = X;
    
    // 走る時間と静止する時間の合計
    int iIntervalTime = A + B;

    // 現在時間
    // int iNowTime = 0;

    do {

      if (iRestTime >= A) {
          iFar += S*A;
          iRestTime -= iIntervalTime;

      }else{
        iFar += S*iRestTime;
        break;
      }

    } while (iRestTime > 0);

    return String.valueOf(iFar);
  }
}