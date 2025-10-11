/**
C - Bipartize
配点 : 350 点
 */
package atcoder.C;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[][] arrUV = new int[M+1][2];
    for (int i = 0; i < M; i++) {
      arrUV[i][0] = sc.nextInt();
      arrUV[i][1] = sc.nextInt();
    }
    sc.close();
    String answer = func(N,M,arrUV);
    System.out.println(answer); // SUBMIT
  }

  public static String func(int N,int M,int[][] arrUV) {
    // 削除する辺の最小本数。初期値は全ての辺を削除する場合のM本。
    int minRemoveNum = M;


    // N個の頂点の黒白パターン
    for(int i=0; i < (1 << N); i++){
      System.out.println("パターン " + (i+1) + " (" + Integer.toBinaryString(i) + "): ");

      int RemoveNum = 0;

      // すべての辺をチェック
      for(int j=0;j<M;j++){
        int u = arrUV[j][0];
        int v = arrUV[j][1];

        // 頂点が黒か白かみるためにビット演算する
        // 頂点があるビットを一番右にする
        int bitU = i >> (u-1);
        int bitV = i >> (v-1);
        
        // 一番右のビットだけ有効にする(& 0...1)
        bitU = bitU & 1;
        bitV = bitV & 1;

        if (bitU == bitV) {
            RemoveNum++;
        }
      }
      minRemoveNum = Math.min(minRemoveNum,RemoveNum);
    }
    System.out.println("end   func");
    return String.valueOf(minRemoveNum);
  }
}