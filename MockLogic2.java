public class MockLogic2 {
   public static void main(String[] args){
      int i=1,j=1;
      for(i=5;i==5;i-=5){
          for(j=1;j<=i;j++){
         System.out.print("*");
      }System.out.println("");
         for(j=1;j<=i;j++){
           if(j==1||j==5)
             System.out.print("*");
           else
               System.out.print(" ");
    }System.out.println("");
       for(j=1;j<=i;j++){
           if(j==1||j==5||j==2)
             System.out.print("*");
           else
               System.out.print(" ");

     }System.out.println("");
       for(j=1;j<=i;j++){
           if(j==1||j==5||j==3)
             System.out.print("*");
           else
               System.out.print(" ");

     }System.out.println("");
       for(j=1;j<=i;j++)
         System.out.print("*");
}   
}
}