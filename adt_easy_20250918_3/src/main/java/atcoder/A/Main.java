/*
A - 11/22 String
配点 : 150 点
 */
package atcoder.A;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    sc.close();
    String answer = oneoneslatwotwostring(n,s);
    System.out.println(answer);
  }

  public static String oneoneslatwotwostring(int n, String s){
    System.out.println("start oneoneslatwotwostring");
    System.out.println("n:"+n+",s:"+s);
    String answer = "";
    if(n%2==0){
      
      answer = "No";
    }else if(
      n==1
      &&
      s.substring(0,1).equals("/")
    ){
      System.out.println("n2==0 and s==\"/\"");
      answer = "Yes";
    }else{
      int mid = n / 2;
      System.out.println("mid:" + mid);
      String nOne = s.substring(0,mid);
      System.out.println("nOne:"+ nOne);
      String nTwo = s.substring(mid+1);
      System.out.println("nTwo:"+ nTwo);

      String nOneRet = nOne.replaceAll("1","");
      String nTwoRet = nTwo.replaceAll("2", "");

      if(nOneRet.isEmpty() && nTwoRet.isEmpty()){
        answer = "Yes";
      }else{
        answer = "No";
      }
    }
    System.out.println("answer:" + answer);
    System.out.println("end   oneoneslatwotwostring");
    return answer;
  }
}