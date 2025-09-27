/*
A - Lexicographic Order  / 
配点 : 100 点
 */
package atcoder.A;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    sc.close();
    String answer = func(s,t);
    System.out.println(answer);
  }

  public static String func(String s,String t){
    String answer;
    if(s.compareTo(t) < 0){
      answer = "Yes";
    }else{
      answer = "No";
    }
    return answer;
  }
}