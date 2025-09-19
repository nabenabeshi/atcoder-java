/*
B - September  / 
実行時間制限: 2 sec / メモリ制限: 1024 MiB

配点 : 
100 点

問題文
英小文字からなる 
12 個の文字列 
S 
1
​
 ,S 
2
​
 ,…,S 
12
​
  があります。

S 
i
​
  の長さが 
i であるような整数 
i 
(1≤i≤12) がいくつあるか求めてください。

制約
S 
i
​
  は英小文字からなる長さ 
1 以上 
100 以下の文字列である。
(1≤i≤12)
入力
入力は以下の形式で標準入力から与えられる。

S 
1
​
 
S 
2
​
 
⋮
S 
12
​
 
出力
S 
i
​
  の長さが 
i であるような整数 
i 
(1≤i≤12) がいくつあるか出力せよ。

入力例 1
Copy
january
february
march
april
may
june
july
august
september
october
november
december
出力例 1
Copy
1
S 
i
​
  の長さが 
i であるような整数 
i は 
9 の 
1 つのみです。よって、1 と出力します。

入力例 2
Copy
ve
inrtfa
npccxva
djiq
lmbkktngaovl
mlfiv
fmbvcmuxuwggfq
qgmtwxmb
jii
ts
bfxrvs
eqvy
出力例 2
Copy
2
S 
i
​
  の長さが 
i であるような整数 
i は 
4,8 の 
2 つです。よって、2 と出力します。
*/
package atcoder.B;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] sArray = new String[12];
    for(int i=0; i<12; i++){
      sArray[i] = sc.nextLine();
    }
    sc.close();
    int answer = September(sArray);
    System.out.println(answer);
  }

  public static int September(String[] sArray){
    int ans = 0;
    for(int i=0; i<12; i++){
      if(sArray[i].length() == i+1){
        ans++;
      }
    }
    return ans;
  }
}