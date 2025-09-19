/*
A - Takahashi san  / 
実行時間制限: 2 sec / メモリ制限: 1024 MiB

配点 : 
100 点

問題文
キーエンスでは、役割や年齢、立場の違いに関係なく「さん」付けして呼ぶという文化があります。 新入社員が社長を呼ぶときも「中田さん」と呼びます。

ある人の苗字と名前がそれぞれ文字列 
S,T として与えられます。

苗字、スペース（ ）、敬称（san）をこの順に連結した文字列を出力してください。

制約
S,T は以下の各条件を満たす文字列
長さ 
1 以上 
10 以下
先頭の文字は英大文字
先頭以外の文字は英小文字
入力
入力は以下の形式で標準入力から与えられる。

S 
T
出力
苗字、スペース（ ）、敬称（san）をこの順に連結した文字列を出力せよ。

入力例 1
Copy
Takahashi Chokudai
出力例 1
Copy
Takahashi san
苗字（Takahashi）、スペース（ ）、敬称（san）をこの順に連結した文字列を出力します。

入力例 2
Copy
K Eyence
出力例 2
Copy
K san
 */
package atcoder.A;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    String answer = takahashisan(s,t);
    System.out.println(answer);
    sc.close();
  }

  public static String takahashisan(String s, String t){
    return s + " san";
  }
}