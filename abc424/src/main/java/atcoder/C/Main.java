/**
C - New Skill Acquired / 
実行時間制限: 2 sec / メモリ制限: 1024 MiB

配点 : 
300 点

問題文
高橋君はゲームをしています。このゲームには 
1 から 
N の番号がついた 
N 個のスキルがあります。

N 個の整数の組 
(A 
1
​
 ,B 
1
​
 ),…,(A 
N
​
 ,B 
N
​
 ) が与えられます。
(A 
i
​
 ,B 
i
​
 )=(0,0) のとき高橋君はスキル 
i を習得済みです。
そうでないとき、スキル 
A 
i
​
 ,B 
i
​
  の少なくとも一方を習得済みのときかつそのときに限りスキル 
i を習得することができます。

既に取得済みのスキルも含め、高橋君が最終的に習得することができるスキルの個数を求めてください。

制約
1≤N≤2×10 
5
 
(A 
i
​
 ,B 
i
​
 )=(0,0) または 
1≤A 
i
​
 ,B 
i
​
 ≤N
入力は全て整数
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
答えを出力せよ。

入力例 1
Copy
6
0 0
1 3
3 2
5 5
4 6
6 4
出力例 1
Copy
3
最初、高橋君はスキル 
1 を習得済みです。スキル 
1 を習得済みのためスキル 
2 を習得することができ、スキル 
2 を習得したことでスキル 
3 を習得できます。
スキル 
4,5,6 を習得することはできないため、答えは 
3 となります。

入力例 2
Copy
4
0 0
0 0
0 0
0 0
出力例 2
Copy
4
 * 
 */
package atcoder.C;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr_ab = new int[n][3];
    for(int i=0;i<n;i++){
      arr_ab[i][0] = sc.nextInt();
      arr_ab[i][1] = sc.nextInt();
    }
    sc.close();
    String answer = func1(arr_ab,n);
    System.out.println(answer);
  }

  public static String func1(int[][] arr_ab,int n){

    int answer = 0;
    ArrayList<Integer> learnedSkills = new ArrayList<>();

    int[][] arr = new int[n][2];
    for(int i=0;i<n;i++){
        int intAi = arr_ab[i][0];
        int intBi = arr_ab[i][1];
        int skillNum = intAi;
      if (intAi == 0 && intBi == 0) {
        // System.out.println("learned");
        learnedSkills.add(i+1);
        answer++;
      }else if(intAi > intBi){
        skillNum = intBi;
      }
      arr[i][0] = i+1;
      arr[i][1] = skillNum;
    }

    arr = sort2dFromIndex(arr,1);

    for(int i=0;i<n;i++){
      int skillNum = arr[i][0];
      
      if(learnedSkills.contains(skillNum)){
        continue;
      }
      int preSkillNum = arr[i][1];
      if (learnedSkills.contains(preSkillNum)) {
        learnedSkills.add(skillNum);
        answer++;
      }
    }
    return Integer.toString(answer);
  }

    public static int[][] sort2dFromIndex(int[][] arr2d, int index){
    Arrays.sort(arr2d, ( a ,b ) -> {
      return Integer.compare(a[index],b[index]);
    });

    return arr2d;
  }
}