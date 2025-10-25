/**
C - Brackets Stack Query
配点 : 300 点
 */
package atcoder.C;

import java.util.Scanner;
import java.util.Stack;


public class Main {


  /**
   * 各時点でおの状態を保持するクラス（レコード）
   * @param balance 現在のバランス:(なら+1、)なら-1
   * @param minBakance これまでの履歴での balance の最小値
   */
  private record State(int balance, int minBalance){}
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Q = sc.nextInt();

    // 状態の履歴を保持するスタック
    Stack<State> history = new Stack<>();

    // 履歴に初期状態(空文字:0,0)を追加
    history.push(new State(0,0));

    for(int i=0;i<Q;i++){
      int que = sc.nextInt();
      if (que == 1) {

        // 現在の状態を取得し、変数に格納（スタックから取り出さずに見るだけ）
        State currentState = history.peek();
        int newBalance = currentState.balance();
        int newMinBalance = currentState.minBalance();

        System.out.print("1 ");
        char c = sc.next().charAt(0);

        if(c == '('){
          System.out.print("( ");
          newBalance++;
        }else{
          System.out.print(") ");
          newBalance--;
        }

        // 最小バランスを更新
        newMinBalance = Math.min(newMinBalance,newBalance);

        // 履歴に追加
        history.push(new State(newBalance,newMinBalance));
      }else{
        System.out.print("2 ");
        System.out.print("d ");
        history.pop();
      }

      // 現在のステータスを取得
      State nowState = history.peek();

      if (nowState.balance() == 0 && nowState.minBalance() == 0) {
        System.out.println("Yes"); // SUBMIT
      }else{
        System.out.println("No"); // SUBMIT
      }
    }
    sc.close();
  }
}