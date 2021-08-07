import java.util.Scanner;
class SolderCal{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int totalSdl=sc.nextInt();
int x=0,y=0;
int arr[]=new int[totalSdl];
for(int i=0;i<totalSdl;i++){
  arr[i]=sc.nextInt();
}
for(int i=0;i<totalSdl;i++){
   if(arr[i]%2==0)
    x++;
   else
   y++;
}
if(x>y)
System.out.println("READY FOR BATTLE");
else
System.out.println("NOT READY");

}
}