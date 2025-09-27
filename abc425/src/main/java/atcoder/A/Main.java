/**
A - Sigma Cubes
配点 : 200 点
 */
package atcoder.A;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    String answer = func(n);
    System.out.println(answer);
  }

  public static String func(int n){
    // System.out.println("n:" + n);
    int ans = 0;
    for(int i=1;i<=n;i++){
      int val = (int) Math.pow(i, 3);
      // System.out.println("val1:" + val);
      if (i % 2 == 1) {
        val *= -1;
      }
      // System.out.println("val2:" + val);
      ans += val;
      // System.out.println("ans:" + ans);
    }
    return Integer.toString(ans);
  }
}