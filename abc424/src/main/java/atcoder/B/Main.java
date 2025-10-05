/**
B - Perfect / 
実行時間制限: 2 sec / メモリ制限: 1024 MiB

配点 : 
200 点

問題文
N 人の人が、
M 問からなるプログラミングコンテストに参加しました。
参加者は人 
1, 人 
2, 
…, 人 
N と番号づけられており、問題は問題 
1, 問題 
2, 
…, 問題 
M と番号づけられています。

このコンテストでは 
K 個のイベントが順番に起き、
i 番目 
(1≤i≤K) のイベントでは次のことが起きました。

人 
A 
i
​
  が問題 
B 
i
​
  に正解した。
同じイベントが 
2 回以上起きることはありません。 また、この 
K 個のイベント以外に誰かがどれかの問題に正解することはありません。

すべての問題に正解した人の番号を全員出力してください。
そのような人が複数いる場合は、すべての問題に正解したタイミングが早い順に出力してください。

制約
1≤N≤10
1≤M≤10
K≥1
1≤A 
i
​
 ≤N
1≤B 
i
​
 ≤M
i

=j ならば 
(A 
i
​
 ,B 
i
​
 )

=(A 
j
​
 ,B 
j
​
 )
入力はすべて整数
入力
入力は以下の形式で標準入力から与えられる。

N 
M 
K
A 
1
​
  
B 
1
​
 
A 
2
​
  
B 
2
​
 
⋮
A 
K
​
  
B 
K
​
 
出力
すべての問題に正解した人の番号を、すべての問題に正解したタイミングが早い順に空白区切りで一行に出力せよ。
すべての問題に正解した人がいないならば、何も出力しないようにせよ。

入力例 1
Copy
3 2 5
1 1
3 2
2 1
3 1
1 2
出力例 1
Copy
3 1
コンテストでは次のことが順に起きました。

人 
1 が問題 
1 に正解した。人 
1 はこれまでに、問題 
1 のみに正解した。
人 
3 が問題 
2 に正解した。人 
3 はこれまでに、問題 
2 のみに正解した。
人 
2 が問題 
1 に正解した。人 
2 はこれまでに、問題 
1 のみに正解した。
人 
3 が問題 
1 に正解した。人 
3 はこれまでに、問題 
1,2 に正解した。よって、この時点で人 
3 はすべての問題に正解した。
人 
1 が問題 
2 に正解した。人 
1 はこれまでに、問題 
1,2 に正解した。よって、この時点で人 
1 はすべての問題に正解した。
よって、すべての問題に正解したのは人 
1,3 であり、すべての問題に正解したタイミングは人 
3 の方が早いです。
よって、
3,1 をこの順に空白区切りで出力します。

入力例 2
Copy
2 2 2
1 1
2 2
出力例 2
Copy
すべての問題に正解した人がいない場合は、何も出力しないでください。
 * 
 */
package atcoder.B;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int k = sc.nextInt();
    int[][] arr_ab = new int[k][2];
    for(int i=0;i<k;i++){
      arr_ab[i][0] = sc.nextInt();
      arr_ab[i][1] = sc.nextInt();
    }

    sc.close();
    String answer = func1(arr_ab,n,m,k);
    System.out.println(answer);
  }

  public static String func1(int[][] arr_ab,int n, int m, int k){
    int[] iParticipants = new int[n];
    String strAllAnswered = "";

    for(int i=0;i<k;i++){
      int iAnswerdPersonNo = arr_ab[i][0];
      System.out.println(arr_ab[i][0] + "," + arr_ab[i][1]);
      System.out.println(iAnswerdPersonNo - 1);
      iParticipants[iAnswerdPersonNo-1]++;

      if(iParticipants[iAnswerdPersonNo-1] == m){
        strAllAnswered += " " + iAnswerdPersonNo;
      }
    }
    return strAllAnswered.trim();
  }
}