import java.util.Scanner;
class StepWays{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int steps=sc.nextInt();
  System.out.println(steps(steps+1));
}
static int steps(int count){
 if(count<=1)
   return count;
 return steps(count-1)+steps(count-2);
}
}