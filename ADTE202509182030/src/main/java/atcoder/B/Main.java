/*
B - New Generation ABC  / 
実行時間制限: 2 sec / メモリ制限: 1024 MiB

配点 : 
100 点

問題文
AtCoder Beginner Contest は、今回で 
214 回目の開催となりました。

今までの AtCoder Beginner Contest において、出題される問題数は次のように変化しました。

1 回目から 
125 回目までは 
4 問
126 回目から 
211 回目までは 
6 問
212 回目から 
214 回目までは 
8 問
N 回目の AtCoder Beginner Contest において出題された問題数を求めてください。

制約
1≤N≤214
入力は全て整数である。
入力
入力は以下の形式で標準入力から与えられる。

N
出力
答えを出力せよ。

入力例 1
Copy
214
出力例 1
Copy
8
入力例 2
Copy
1
出力例 2
Copy
4
入力例 3
Copy
126
出力例 3
Copy
6
 */
package atcoder.B;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    String answer = newGenerationABC(n);
    System.out.println(answer);
  }

  public static String newGenerationABC(int n){
    if(n<=125){
      return "4";
    }else if(n<=211){
      return "6";
    }else if(n<=214){
      return "8";
    }else{
      return "ng";
    }
  }
}