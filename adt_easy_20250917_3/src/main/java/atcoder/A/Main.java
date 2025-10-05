/**
A - Takahashi san
配点 : 100 点
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