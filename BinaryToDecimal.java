import java.util.Scanner;
public class BinaryToDecimal
{
    public static void main(String[] args){
        Scanner bd=new Scanner(System.in);
        long binaryNum=bd.nextLong();
        if(binaryNum==0000)
           System.out.println("0");
        else{
        long result=getDecimal(binaryNum);
        if(result==0)
           System.out.println("Invalid Input");
        else 
          System.out.println(result);
        
}
    }
    static long getDecimal(long n){
       long temp;
       long sum=0,i=0;
       while(n!=0){
       temp=n%10;
         if(temp==1||temp==0){
            int j=(int)(Math.pow(2,i));
            sum=sum+(temp*j);
            n=n/10;
            i++;
         }
         else
           return 0;
       }
       return sum;
    }
}