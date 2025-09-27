/*
B - Buy a Pen  / 
配点 : 100 点
*/
package atcoder.B;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int g = sc.nextInt();
    int b = sc.nextInt();
    String c = sc.next();
    sc.close();
    String answer = func(r,g,b,c);
    System.out.println(answer);
  }

  public static String func(
    int r,
    int g,
    int b,
    String c
    ){
      String answer;
      if(c.equals("Red")){
        if(g > b){
          answer = Integer.toString(b);
        }else{
          answer = Integer.toString(g);
        }
      }else if(c.equals("Green")){
        if (r > b) {
          answer = Integer.toString(b);
        } else {
          answer = Integer.toString(r);
        }
      }else{
        if (r > g) {
          answer = Integer.toString(g);
        } else {
          answer = Integer.toString(r);
        }
      }
      return answer;
  }
}