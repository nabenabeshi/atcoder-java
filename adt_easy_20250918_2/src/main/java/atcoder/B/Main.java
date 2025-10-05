/*
B - A to Z String 2
配点 : 100 点
 */
package atcoder.B;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    sc.close();
    System.out.println(aToZString2(n,x));
  }

  public static String aToZString2(int n, int x){
    String answer = "";
    int cnt = 0;

    for(int i=65; i<= 90; i++ ){
      for(int j=0; j< n; j++ ){
        cnt++;
        if(cnt == x){
          answer = Character.toString((char) i);
          break;
        }
      }
      if(!answer.isEmpty()){
        break;
      }
    }

    return answer;
  }
}