/*
A - ファンレター 
実行時間制限: 2 sec / メモリ制限: 1024 MiB

配点 : 
100 点

問題文
あなたはアイドルグループ Bit♡Beat のプロデューサーです。

Bit♡Beat の事務所に 
N 個のファンレターが届きました。 
i 個目のファンレターは 
A 
i
​
  月 
B 
i
​
  日に届いたものです。

これら 
N 個のファンレターの日付を早い順（
1 月 
1 日から始めて、先に訪れる順）に出力してください。

制約
1≤N≤365
A 
i
​
  月 
B 
i
​
  日は平年（うるう年ではない年）において正しい日付である。
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
(i

=j)
入力される値は全て整数
入力
入力は以下の形式で標準入力から与えられる。

N
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
N
​
  
B 
N
​
 
出力
N 行出力せよ。

i 行目 
(1≤i≤N) には、届いた日付が 
i 番目に早いファンレターの日付の月と日を半角スペース区切りで出力せよ。

入力例 1
Copy
3
3 15
1 15
3 8
出力例 1
Copy
1 15
3 8
3 15
事務所には 
3 月 
15 日、 
1 月 
15 日、 
3 月 
8 日にファンレターが届きました。

これらの日付を早い順に並べると 
1 月 
15 日、 
3 月 
8 日、 
3 月 
15 日となります。したがって、上記のように出力してください。

入力例 2
Copy
5
1 1
1 2
1 3
1 4
1 5
出力例 2
Copy
1 1
1 2
1 3
1 4
1 5
入力例 3
Copy
10
9 21
8 22
10 28
6 22
6 26
7 10
5 3
8 31
9 4
11 21
出力例 3
Copy
5 3
6 22
6 26
7 10
8 22
8 31
9 4
9 21
10 28
11 21
 */
package atcoder.A;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr_ab = new int[n][2];
    for(int i=0;i<n;i++){
      arr_ab[i][0] = sc.nextInt();
      arr_ab[i][1] = sc.nextInt();
    }
    sc.close();
    System.out.println(sortDate(arr_ab));
  }

  public static String sortDate(int[][] arr2d){
    String answer = "";

    arr2d = sortDate(arr2d,1);
    arr2d = sortDate(arr2d, 0);

    for(int[] row : arr2d){
      answer += row[0] + " " + row[1] + "\r\n";
    }

    System.out.println("answer:"+answer);

    return answer;
  }

  public static int[][] sortDate(int[][] arr2d, int index){
    Arrays.sort(arr2d, ( a ,b ) -> {
      return Integer.compare(a[index],b[index]);
    });

    return arr2d;
  }
}