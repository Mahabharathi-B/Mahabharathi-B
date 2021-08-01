import java.util.Scanner;
class StringExample
{
public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
 String value=sc.nextLine();
 String arr[]=value.split("\\s");
  int n=value.length();
  int a=n-(arr.length)+1;
 String result="",val="";

int count=0;
for(int i=0;i<arr.length;i++)
   for(int j=0;j<arr[i].length();j++) {
     if(arr[i].charAt(j)>='a'&&arr[i].charAt(j)<='z'||arr[i].charAt(j)>='A'&&arr[i].charAt(j)<='Z')
       count++;
 }


if(a==count){
for(int i=0;i<arr.length;i++){
if(i==0){
val=arr[i];
result=val.toLowerCase();
}
else{
val=arr[i];
String l1=val.substring(0,1);
String remain=val.substring(1);
result=l1.toUpperCase()+remain.toLowerCase();

}

System.out.print(result);
}

}
else
System.out.print("Invalid");
}
}
