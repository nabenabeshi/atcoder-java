/**
A 100 点
 */
package atcoder.B;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int N = sc.nextInt();
    int[] Wn = new int[N+1];
    int[] WnFlg = new int[N + 1];
    for (int i = 1; i <= N; i++) {
      Wn[i] = sc.nextInt();
    }
    int Q = sc.nextInt();
    int lobotWeight = X;
    for (int i = 1; i <= Q; i++) {
      int buhinNo = sc.nextInt();
      if(WnFlg[buhinNo]==0){
        lobotWeight += Wn[buhinNo];
        WnFlg[buhinNo] = 1;
      }else{
        lobotWeight -= Wn[buhinNo];
        WnFlg[buhinNo] = 0;
      }
      System.out.println(lobotWeight); // SUBMIT
    }
    sc.close();
  }
}