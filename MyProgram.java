public class MyProgram{
  /* static void myMethod(String fName , int age) {
    System.out.println(fName + " maha" +age);*/
  static int myMethod(int x ,int y){
    return x + y ;
}
  static double myMethod(double x ,double y){
    return x + y ;
} 
  static void checkAge(int age){
   if (age<18){
    System.out.println("access denied");
} else {

  System.out.println("access granted"); 
}
}

  public static void main(String[] args) {
      /*myMethod("bharathi",19);
        myMethod("raja",20); void method*/
	int z = myMethod(5,3);
       double s = myMethod(8.5,19.7);
       System.out.println(s);
       System.out.println(z);
 
        checkAge(20);
 }
}