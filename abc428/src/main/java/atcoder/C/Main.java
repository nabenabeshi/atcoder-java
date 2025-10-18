/**
C - Brackets Stack Query
配点 : 300 点
 */
package atcoder.C;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Q = sc.nextInt();

    int que = sc.nextInt();
    sc.next();
    List<Integer> list = new ArrayList<>();
    list.add(+1);
    int iState = 1;
    System.out.println("1 ( "+iState+" No");
    System.out.println("No"); // SUBMIT

    for(int i=1;i<Q;i++){
      que = sc.nextInt();
      if (que == 1) {
        System.out.print("1 ");
        char c = sc.next().charAt(0);
        if(c == ')'){
          System.out.print(") ");
          iState--;
          list.add(-1);
        }else{
          System.out.print("( ");
          iState++;
          list.add(+1);
        }
      }else{
        System.out.print("2 ");
        System.out.print("d ");
        System.out.print("消す値:"+ list.get(list.size()-1)+" ");
        iState -= list.get(list.size()-1);
      }
      System.out.print(iState+" ");
      if (iState == 0) {
        System.out.println("Yes"); // SUBMIT
      }else{
        System.out.println("No"); // SUBMIT
      }
    }

    sc.close();
  }
}