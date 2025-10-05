/**
B - Perfect
配点 : 200 点
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