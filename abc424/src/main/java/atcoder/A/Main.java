/**
A - Isosceles / 
実行時間制限: 2 sec / メモリ制限: 1024 MiB

配点 : 
100 点

問題文
面積が正である三角形 ABC があります。
三角形 ABC の三辺の長さはそれぞれ 
a,b,c です。

三角形 ABC が二等辺三角形であるか判定してください。

制約
1≤a,b,c≤10
三辺の長さが 
a,b,c であるような三角形が存在し、その面積は正である。
a,b,c は整数
入力
入力は以下の形式で標準入力から与えられる。

a 
b 
c
出力
三角形 ABC が二等辺三角形であるならば Yes を、そうでないならば No を出力せよ。

入力例 1
Copy
4 2 4
出力例 1
Copy
Yes
a=c であるため、三角形 ABC は二等辺三角形です。
よって、Yes を出力します。

入力例 2
Copy
3 4 5
出力例 2
Copy
No
三角形 ABC の三辺の長さはすべて異なるため、二等辺三角形ではありません。
よって、No を出力します。

入力例 3
Copy
10 10 10
出力例 3
Copy
Yes
正三角形も二等辺三角形の一種であることに注意してください。
 * 
 */
package atcoder.A;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    sc.close();
    String answer = func1(a,b,c);
    System.out.println(answer);
  }

  public static String func1(int a, int b, int c){
    String answer = "";
    if(a==b || a==c || b == c){
      answer = "Yes";
    }else{
      answer = "No";
    }
    return answer;
  }
}