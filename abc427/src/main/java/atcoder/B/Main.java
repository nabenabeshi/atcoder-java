/**
B - Sum of Digits Sequence
配点 : 200 点
 */
package atcoder.B;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    sc.close();
    String answer = func(n );
    System.out.println(answer); // SUBMIT
  }

  public static String func(String s) {
    int is = Integer.parseInt(s);
    if(is <= 1 ){
      return "1";
    }

    int iPreVal = 1;
    int iAns = 1;
    for(int i=2; i <= is; i++){
      iPreVal = iAns;
      iAns = iPreVal + f(iPreVal);
    }
    return String.valueOf(iAns);
  }

  public static int f(int a){
    String str = String.valueOf(a);
    int ans = 0;
    for(int i=0; i<str.length(); i++){
      ans += Integer.parseInt(str.substring(i, i+1));
    }
    return ans;
  }
}