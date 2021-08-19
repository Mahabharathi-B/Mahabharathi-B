import java.util.*;
class CheckSigns{
public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int T=sc.nextInt();
  for(int i=0;i<T;i++){
     int n=sc.nextInt();
     String s=sc.next();
   int result= getAns(n,s);
   if(result==0)
  System.out.println("NOT INDIAN");
 else if(result==1)
  System.out.println("INDIAN");
 else
  System.out.println("NOT SURE");
  
}
}
static int getAns(int n,String s){
for(int i=0;i<n;i++){
if(s.charAt(i)=='Y')
 return 0;//not indian
}
for(int i=0;i<n;i++){
if(s.charAt(i)=='I')
 return 1;
}
return -1;

}
}