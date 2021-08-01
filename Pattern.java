import java.util.Scanner;
public class Pattern{
  public static void main(String[] args){
  int i,j;
  Scanner sc = new Scanner(System.in);
  System.out.println("enter row:");
  int row = sc.nextInt();
  for(i=1;i<=row;i++){
    for(j=1;j<=i;j++){
      System.out.print("*");
}
System.out.println();
}

}
}