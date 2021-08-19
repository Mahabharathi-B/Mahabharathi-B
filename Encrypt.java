
import java.util.*;
public class Encrypt {
   public static  final String  ALPHABET="abcdefghijklmnopqrstuvwxyz";
   public static final String NUMBER="0123456789";
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int key=sc.nextInt();
        String a[]=s.split("\\s");
        for(int i=0;i<a.length;i++){
            getAns(a[i],key);
        }
    }
   static void  getAns(String n,int key){
       String k="";
       n=n.toLowerCase();
      // System.out.println(n);
       for(int i=0;i<n.length();i++){
           if(n.charAt(i)>=48&&n.charAt(i)<=57){
               int v=NUMBER.indexOf(n.charAt(i));
               int j=(v+key)%10;
               char h=NUMBER.charAt(j);
               k=k+h;
           }
           if(n.charAt(i)>=97&&n.charAt(i)<=122){
           int v=ALPHABET.indexOf(n.charAt(i));
           int j=(v+key)%26;
           char h=ALPHABET.charAt(j);
           k=k+h;
       }
       }
       System.out.print(k);
   }
}