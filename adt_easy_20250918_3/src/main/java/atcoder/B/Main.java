/*
B - New Generation ABC
配点 : 100 点
 */
package atcoder.B;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    String answer = newGenerationABC(n);
    System.out.println(answer);
  }

  public static String newGenerationABC(int n){
    if(n<=125){
      return "4";
    }else if(n<=211){
      return "6";
    }else if(n<=214){
      return "8";
    }else{
      return "ng";
    }
  }
}