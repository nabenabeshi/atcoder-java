/*
A - 11/22 String  / 
実行時間制限: 2 sec / メモリ制限: 1024 MiB

配点 : 
150 点

問題文
この問題における 11/22 文字列の定義は C 問題および E 問題と同じです。

文字列 
T が以下の条件を全て満たすとき、
T を 11/22 文字列 と呼びます。

∣T∣ は奇数である。ここで、
∣T∣ は 
T の長さを表す。
1 文字目から 
2
∣T∣+1
​
 −1 文字目までが 1 である。
2
∣T∣+1
​
  文字目が / である。
2
∣T∣+1
​
 +1 文字目から 
∣T∣ 文字目までが 2 である。
例えば 11/22, 111/222, / は 11/22 文字列ですが、1122, 1/22, 11/2222, 22/11, //2/2/211 はそうではありません。

1, 2, / からなる長さ 
N の文字列 
S が与えられます。
S が 11/22 文字列であるか判定してください。

制約
1≤N≤100
S は 1, 2, / からなる長さ 
N の文字列
入力
入力は以下の形式で標準入力から与えられる。

N
S
出力
S が 11/22 文字列であれば Yes を、そうでなければ No を出力せよ。

入力例 1
Copy
5
11/22
出力例 1
Copy
Yes
11/22 は問題文の 11/22 文字列の条件を満たします。

入力例 2
Copy
1
/
出力例 2
Copy
Yes
/ は問題文の 11/22 文字列の条件を満たします。

入力例 3
Copy
4
1/22
出力例 3
Copy
No
1/22 は問題文の 11/22 文字列の条件を満たしません。

入力例 4
Copy
5
22/11
出力例 4
Copy
No
 */
package atcoder.A;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    sc.close();
    String answer = oneoneslatwotwostring(n,s);
    System.out.println(answer);
  }

  public static String oneoneslatwotwostring(int n, String s){
    System.out.println("start oneoneslatwotwostring");
    System.out.println("n:"+n+",s:"+s);
    String answer = "";
    if(n%2==0){
      
      answer = "No";
    }else if(
      n==1
      &&
      s.substring(0,1).equals("/")
    ){
      System.out.println("n2==0 and s==\"/\"");
      answer = "Yes";
    }else{
      int mid = n / 2;
      System.out.println("mid:" + mid);
      String nOne = s.substring(0,mid);
      System.out.println("nOne:"+ nOne);
      String nTwo = s.substring(mid+1);
      System.out.println("nTwo:"+ nTwo);

      String nOneRet = nOne.replaceAll("1","");
      String nTwoRet = nTwo.replaceAll("2", "");

      if(nOneRet.isEmpty() && nTwoRet.isEmpty()){
        answer = "Yes";
      }else{
        answer = "No";
      }
    }
    System.out.println("answer:" + answer);
    System.out.println("end   oneoneslatwotwostring");
    return answer;
  }
}