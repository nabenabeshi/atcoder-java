/**
A - Isosceles
配点 : 100 点
 */
package atcoder.A;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    sc.close();
    String answer = func1(a,b,c);
    System.out.println(answer);
  }

  public static String func1(int a, int b, int c){
    String answer = "";
    if(a==b || a==c || b == c){
      answer = "Yes";
    }else{
      answer = "No";
    }
    return answer;
  }
}