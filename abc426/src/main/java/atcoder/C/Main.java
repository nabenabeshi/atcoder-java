/**
C - Upgrade Required
配点 : 300 点
 */
package atcoder.C;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int q = sc.nextInt();
    ArrayList<ArrayList<Integer>> arr2d = new ArrayList<ArrayList<Integer>>();
    for (int i = 1; i <= q; i++) {
      arr2d.add(new ArrayList<Integer>(Arrays.asList(sc.nextInt(), sc.nextInt())));
    }
    sc.close();
    String answer = func(n, q, arr2d);
    System.out.println(answer);
  }

  public static String func(int n, int q, ArrayList<ArrayList<Integer>> arr2d) {
    System.out.println("abc426_c funcが始まったよ");
    
    // osの該当バージョンの数を管理する変数
    long[] osVersionCounts = new long[n+1];

    // そのバージョンのPCが1台以上あるかを管理する変数
    TreeSet<Integer> activeVersions = new TreeSet<>();

    // 初期設定ループ
    for (int i = 1; i <= n; i++) {

      // 初期でosVerCount[i]はすべて1
      osVersionCounts[i] = 1;

      // 初期でactiveVersionsはすべて一つずつ
      activeVersions.add(i);

    }

    //String strAns = "";
    StringBuilder sbAns = new StringBuilder();

    for (ArrayList<Integer> ope : arr2d) {
      Integer x = ope.get(0);
      Integer y = ope.get(1);

      // x 以下のバージョンのみ取得する
      // 以下のforループの中でactiveVersionsを変更するため、ループ用にリストにコピーする
      ArrayList<Integer> versionsToMerge = new ArrayList<>(activeVersions.headSet(x, true));

      // y自身は対象外なので削除
      versionsToMerge.remove(y);

      // x 以下のバージョンが存在しない場合はループ終了
      if(versionsToMerge.isEmpty()){
        //strAns += "0\n";
        sbAns.append("0\n");
        continue;
      }

      // 今回アップデートしたカウント
      long updateCount = 0;

      // x以下で存在するバージョン分ループ
      for(int fromVer : versionsToMerge){
        
        // fromVerのPCの数を足し込む
        updateCount += osVersionCounts[fromVer];

        //fromVerのPCはyにアップデートされたのでアップデート先のosVerに移動
        osVersionCounts[y] += osVersionCounts[fromVer];

        // fromVerのPCはyにアップデートされたのでアップデート元のカウントは0になる
        osVersionCounts[fromVer] = 0;

        // fromVerのPCは0件になるので管理変数から削除
        activeVersions.remove(fromVer);

      }
      //strAns += updateCount + "\n";
      sbAns.append(updateCount).append("\n");
    }

    return sbAns.toString();
  }
}