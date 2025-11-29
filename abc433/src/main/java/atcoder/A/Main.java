package atcoder.A;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int Z = sc.nextInt();
    sc.close();

    int i=0;
    while (true) { 
      if( (X+i) == (Y+i)*Z ){
        System.out.println("Yes"); // SUBMIT
        break;
      }else if( (X+i) < (Y+i)*Z ){
        System.out.println("No"); // SUBMIT
        break;
      }
      i++;
    }
  }
}