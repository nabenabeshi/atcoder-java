/*
C - Batters
配点 : 200 点
*/
package atcoder.C;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arrA = new int[n];
    for(int i=0;i<n;i++){
      arrA[i] = sc.nextInt();
    }
    sc.close();
    String answer = func(n,arrA);
    System.out.println(answer);
  }

  public static String func(
    int n,
    int[] arrA
    ){
      int notReturnNumber = 0;
      for(int i=arrA.length-1;i>=0;i--){
        
        notReturnNumber += arrA[i];
        if(notReturnNumber >= 4){
          break;
        }else{
          n--;
        }
      }
      return Integer.toString(n);
  }
}