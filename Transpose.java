import java.util.Scanner;
class Transpose{
public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
 int transpose[][]=new int[10][10];
   int rows=sc.nextInt();
   int columns=sc.nextInt();
   int matrix[][]=new int[rows][columns];
   for(int i=0;i<rows;i++){
   for(int j=0;j<columns;j++){
      matrix[i][j]=sc.nextInt();
}
}
for(int i=0;i<rows;i++){
   for(int j=0;j<columns;j++){
      transpose[j][i]=matrix[i][j];
}
}
System.out.println("");
for(int i=0;i<rows;i++){
   for(int j=0;j<columns;j++){
      System.out.print(transpose[i][j]+" ");
}
System.out.println("");
}
}

}