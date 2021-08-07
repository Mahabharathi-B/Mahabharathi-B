import java.util.Scanner;
class AtmBased{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  double withdrawl=sc.nextDouble();
  double balance=sc.nextDouble();
  if((withdrawl%5==0)&&(withdrawl<=balance+0.50)){
    balance=balance-withdrawl-0.50;
}
System.out.printf("%.2f",balance);
}
}