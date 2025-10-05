/**
B - September
配点 : 100 点
*/
package atcoder.B;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] sArray = new String[12];
    for(int i=0; i<12; i++){
      sArray[i] = sc.nextLine();
    }
    sc.close();
    int answer = September(sArray);
    System.out.println(answer);
  }

  public static int September(String[] sArray){
    int ans = 0;
    for(int i=0; i<12; i++){
      if(sArray[i].length() == i+1){
        ans++;
      }
    }
    return ans;
  }
}