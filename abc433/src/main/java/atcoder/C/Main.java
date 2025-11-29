package atcoder.C;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    sc.close();
    char[] list = S.toCharArray();
    int listNum = list.length;
    int numCount = 1;
    int prevNum = 10;
    // System.err.println("ただいまの文字：" + list[0] + " なにもしない");

    int[] numbers = new int[listNum];
    int[] counts = new int[listNum];
    int ptr = 0;

    for(int i=1;i<list.length;i++){
      
      prevNum = list[(i-1)] - '0';
      int num = list[i] - '0';
      // System.err.print("まえの文字：" + prevNum + " ");
      // System.err.println("いまの文字：" + num + " ");
      if( prevNum == num ){
        numCount++;
      }else{
        numbers[ptr] = prevNum;
        counts[ptr] = numCount;
        // System.err.println("["+prevNum+","+numCount+"]");
        ptr++;
        numCount = 1;
      }
    }
    numbers[ptr] = list[list.length -1] - '0';
    counts[ptr] = numCount;
    ptr++;
    // System.err.println("[" + prevNum + "," + numCount + "]");

    long ans = 0;
    for(int i=0;i<ptr-1;i++) {
      // System.err.println("[" + numbers[i] + "," + counts[i] + "]");
      int val1 = numbers[i];
      int len1 = counts[i];

      int val2 = numbers[i+1];
      int len2 = counts[i+1];

      if (val2 == val1 + 1) {
          ans += Math.min(len1, len2);
      }
    }

    System.out.println(ans); // SUBMIT
  }
}
