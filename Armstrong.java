import java.util.Scanner;
import java.lang.Math;
public class Armstrong{
    public static void main(String[] args){
        int startno,endno,i,flag=0;
        Scanner sc = new Scanner(System.in);
         startno=sc.nextInt();
         endno=sc.nextInt();
       
       for(i=startno;i<=endno;i++)
       {
            if(isArmstrong(i)){
                System.out.print(i+" ");
                flag=1;
            }
        }
       if(flag==0)
            System.out.println("-1");
    }
    static boolean isArmstrong(int n){
        int r,temp,sum=0,digits=0;
        temp=n;
        while(temp>0){
            temp=temp/10;
            digits++;
        }
        temp=n;
        while(n!=0){
            r=n%10;
            sum+=(Math.pow(r,digits));
            n/=10;
          }
        
        if(sum==temp)
            return true;
         else
           return false;
    }
}