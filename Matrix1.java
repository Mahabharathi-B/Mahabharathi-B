import java.util.Scanner;
class Matrix1{
public static void main(String args[]){
int i,j;
Scanner sc = new Scanner(System.in);
int a[][] = new int[2][2];
int b[][] = new int[2][2];
int result[][] = new int[2][2];
for (i= 0 ; i < 2; i++ ){ 
 for (j= 0 ; j < 2 ;j++ ){
    a[i][j] = sc.nextInt();
 } 
System.out.println();
}
 for ( i= 0 ; i < 2; i++ ){
 for ( j= 0 ; j <2 ;j++ ){
    b[i][j] = sc.nextInt();
}
   System.out.println();
 }
for ( i= 0 ; i < 2 ; i++ ){
for ( j= 0 ; j < 2;j++ ){
result[i][j] = a[i][j] + b[i][j] ; 
 }
}
for ( i= 0 ; i < 2; i++ ){ 
for ( j= 0 ; j < 2 ;j++ ){
System.out.print(result[i][j]+" ");
} 
System.out.println();
}
 
}
}