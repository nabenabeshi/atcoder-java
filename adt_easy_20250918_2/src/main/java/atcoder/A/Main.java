/**
A - ファンレター
配点 : 100 点
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