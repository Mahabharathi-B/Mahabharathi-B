import java.util.Scanner;
class FlightTicket{
   public static void main(String[] args){
  int discount=0;int amount=2000;
   Scanner sc=new Scanner(System.in);
   String flyingDate=sc.nextLine();
   String birthday=sc.nextLine();
   String value[]=flyingDate.split(":");
   String value1[]=birthday.split(":");
 if(value[0].equals(value1[0]))
  if(value[1].equals(value1[1])){
   System.out.println("You got discount of 10%!!");
   discount=2000/10;
  amount=2000-discount;
}
   System.out.println("your ticket amount "+amount);
}
}