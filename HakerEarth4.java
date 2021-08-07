import java.io.*;
import java.util.*;


public class HakerEarth4 {
    public static void main(String[] args) throws IOException {
        
    Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();
    String val="";
   int result=0;
    String arr[]=new String[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.next();
    }    
   for(int i=0;i<n/2;i++){
     val+=arr[i].charAt(0);
    }
    for(int i=n/2;i<n;i++){
        int k=arr[i].length();
     val+=arr[i].charAt(k-1);
    }
System.out.println(val);
int res=Integer.parseInt(val);
if(res%11==0)
System.out.println("OUI");
else
System.out.println("NON");

    }
}