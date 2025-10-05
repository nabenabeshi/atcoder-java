/**
C - New Skill Acquired
配点 : 300 点
 */
package atcoder.C;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] arr_ab = new int[n][3];
    for(int i=0;i<n;i++){
      arr_ab[i][0] = sc.nextInt();
      arr_ab[i][1] = sc.nextInt();
    }
    sc.close();
    String answer = func1(arr_ab,n);
    System.out.println(answer);
  }

  public static String func1(int[][] arr_ab,int n){

    int answer = 0;
    ArrayList<Integer> learnedSkills = new ArrayList<>();

    int[][] arr = new int[n][2];
    for(int i=0;i<n;i++){
        int intAi = arr_ab[i][0];
        int intBi = arr_ab[i][1];
        int skillNum = intAi;
      if (intAi == 0 && intBi == 0) {
        // System.out.println("learned");
        learnedSkills.add(i+1);
        answer++;
      }else if(intAi > intBi){
        skillNum = intBi;
      }
      arr[i][0] = i+1;
      arr[i][1] = skillNum;
    }

    arr = sort2dFromIndex(arr,1);

    for(int i=0;i<n;i++){
      int skillNum = arr[i][0];
      
      if(learnedSkills.contains(skillNum)){
        continue;
      }
      int preSkillNum = arr[i][1];
      if (learnedSkills.contains(preSkillNum)) {
        learnedSkills.add(skillNum);
        answer++;
      }
    }
    return Integer.toString(answer);
  }

    public static int[][] sort2dFromIndex(int[][] arr2d, int index){
    Arrays.sort(arr2d, ( a ,b ) -> {
      return Integer.compare(a[index],b[index]);
    });

    return arr2d;
  }
}