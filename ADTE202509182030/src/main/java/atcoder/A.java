// src/main/java/atcoder/A.java
package atcoder;
import java.util.Scanner;

public class A {
  public static int solve(int a, int b){
    return a + b;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = A.solve(a, b);
    System.out.println(sum);
    sc.close();
  }
}