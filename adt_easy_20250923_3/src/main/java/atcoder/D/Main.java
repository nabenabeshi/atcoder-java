/**
D - tcaF
配点 : 150 点
*/
package atcoder.D;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger x = sc.nextBigInteger();
    sc.close();
    String answer = func(x);
    System.out.println(answer);
  }

  public static String func(
      BigInteger x) {
    BigInteger numOfMulti = new BigInteger("2");
    BigInteger ret = new BigInteger("2");
    do {

      if (x.equals(ret)) {
        break;
      } else {
        numOfMulti = numOfMulti.add(new BigInteger("1"));
        ret = ret.multiply(numOfMulti);
      }

    } while (true);
    return numOfMulti.toString();
  }
}